public class Ejercicio1_Randy {

   
    static int cuadrado(int numero) {
        int resultado = numero * numero;
        return resultado;
    }

    static int sumaCuadrados(int numero) {
        int c1 = cuadrado(numero);
        int c2 = cuadrado(numero + 1);
        return c1 + c2;
    }

    static void mostrarResultados(int x) {
        int parte1 = sumaCuadrados(x);         
        int suma = sumaCuadrados(1);    
        int parte2 = cuadrado(suma);        
        System.out.println(parte1 + " " + parte2);
        System.out.println(x);
    }

    public static void main(String[] args) {
        int x = 2;
        mostrarResultados(x);
    }
}
/* Escribir la salida exacta
13 25
2
   
*/