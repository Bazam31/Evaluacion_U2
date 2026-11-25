public class Ejercicio2_Randy{

static int pot(int b, int e, String indent) {
    System.out.println(indent + "-> pot(" + b + ", " + e + ")");
    if (e == 0) {
        System.out.println(indent + "<- retorna 1 (caso base)");
        return 1;
    }
    int res = b * pot(b, e - 1, indent + "  ");
    System.out.println(indent + "<- retorna " + res + " (" + b + " * " + (res / b) + ")");
    return res;
 }
}
/*

pot(3, 4) → e != 0 -> 3 * pot(3, 3)

pot(3, 3) ->e != 0 → 3 * pot(3, 2)

pot(3, 2) -> e != 0 → 3 * pot(3, 1)

pot(3, 1) -> e != 0 → 3 * pot(3, 0)

pot(3, 0) -> e == 0 → caso base, devuelve 1


pot(3, 1) calcula 3 * 1 -> devuelve 3

pot(3, 2) calcula 3 * 3 -> devuelve 9

pot(3, 3) calcula 3 * 9 -> devuelve 27

pot(3, 4) calcula 3 * 27 -> devuelve 81
*/
