package ar.edu.undef.fie;

// Hacer un programa que inicialice dos listas y muestre por pantalla la intersección entre las mismas.
public class Main {
    public static void main(String[] args) {
        int[] lista1 = {1, 2, -4, 8, 5, 6, 99};
        int[] lista2 = {1, 3, 5, 8, 99, 9, -4};

        interseccion(lista1, lista2);
    }

    private static void interseccion(int[] lista1, int[] lista2) {
        for (var numero1 : lista1) {
            for (var numero2 : lista2) {
                if (numero1 == numero2) System.out.println(numero1);
            }
        }
    }
}
