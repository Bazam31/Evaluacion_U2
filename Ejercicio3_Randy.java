public class Ejercicio3_Randy {
    static void metodo3(int a, int[] v) {
        a++;
        v[1] += a;
    }

    public static void main(String[] args) {
        int a = 5;
        int[] v = {1, 2, 3};
        metodo3(a, v);
        System.out.println(a + " " + v[1]);
    }
}
    
// main: int a = 5; int[] v = {1, 2, 3}; m(a, v); System.out.println(a + " " + v[1]);

/* ¿Qué imprime? Explica por qué a no cambia y v[1] sí.
imprime: 5 y 8

a no cambia porque es una constante  
v si cambia porque se le va sumando a y por eso hace que su resultado varie
 */
