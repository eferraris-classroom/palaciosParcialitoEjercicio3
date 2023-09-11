package ar.edu.undef.fie;

public class Main {
    public static void main(String[] args) {
        int[] lista1 = {1, 2, -4, 8, 5, 6, 99};     // Inicializo lista 1
        int[] lista2 = {1, 5, 99, 9, -4, 2, 0};     // Inicializo lista 2

        interseccion(lista1, lista2);
    }

    // Funcion que imprime la interseccion de dos listas
    private static void interseccion(int[] lista1, int[] lista2) {
        for (var numero1 : lista1) {
            for (var numero2 : lista2) {
                if (numero1 == numero2) System.out.println(numero1); //En este caso solo muestro, como pide el enunciado
            }
        }
    }
}