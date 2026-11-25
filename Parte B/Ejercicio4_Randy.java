/*
4. Parqueadero (6 pts). Escribe leerMinutos(Scanner sc) (valida 1–1440), horasCobradas(int
minutos) (la fracción de hora se cobra completa) y tarifa(int horas, char tipo) (auto $1,00 la hora;
moto $0,50; más de 8 horas: 20 % de descuento). El main lee los datos y muestra horas y total. Prueba: 125
min, auto → 3 h, $3,00; 600 min, moto → 10 h, $4,00.
*/
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4_Randy {

  
    public static int leerMinutos(Scanner sc) {
        int minutos;
        while (true) {
            System.out.print("Ingrese los minutos (1 - 1440): ");
            if (sc.hasNextInt()) {
                minutos = sc.nextInt();
                if (minutos >= 1 && minutos <= 1440) {
                    return minutos;
                }
                System.out.println("Error: el valor debe estar entre 1 y 1440.");
            } else {
                System.out.println("Error: ingrese un número entero válido.");
                sc.next();
            }
        }
    }

  
    public static int horasCobradas(int minutos) {
        return (int) Math.ceil(minutos / 60.0);
    }

    
    public static double tarifa(int horas, char tipo) {
        char tipoMayus = Character.toUpperCase(tipo);
        double precioHora;

        if (tipoMayus == 'A') {
            precioHora = 1.00;
        } else if (tipoMayus == 'M') {
            precioHora = 0.50;
        } else {
            throw new IllegalArgumentException("Tipo de vehículo no válido. Use 'A' (auto) o 'M' (moto).");
        }

        double total = horas * precioHora;

        if (horas > 8) {
            total *= 0.80; 
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minutos = leerMinutos(sc);

        char tipo;
        while (true) {
            System.out.print("Ingrese el tipo de vehículo (A = auto, M = moto): ");
            String entrada = sc.next().trim().toUpperCase();
            if (entrada.length() == 1 && (entrada.charAt(0) == 'A' || entrada.charAt(0) == 'M')) {
                tipo = entrada.charAt(0);
                break;
            }
            System.out.println("Error: ingrese 'A' para auto o 'M' para moto.");
        }

        int horas = horasCobradas(minutos);
        double total = tarifa(horas, tipo);

        System.out.printf(Locale.US, "Horas cobradas: %d h%n", horas);
        System.out.printf(Locale.US, "Total a pagar: $%.2f%n", total);

        sc.close();
    }
}