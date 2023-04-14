package Guia5;

import java.util.Scanner;

/*Realice un programa que compruebe si una matriz dada es antisimétrica. Se dice que una matriz A
es antisimétrica cuando ésta es igual a su propia traspuesta, pero cambiada de signo.
Es decir, A es antisimétrica si A = -AT. La matriz traspuesta de una matriz A se denota por AT 
y se obtiene cambiando sus filas por columnas (o viceversa).
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        int matriz[][];
        System.out.println("Ingrese el tamaño de la matriz");
        Scanner leer = new Scanner(System.in);
        int tamanio = leer.nextInt();
        matriz = new int[tamanio][tamanio];

        System.out.println("Ingrese los valores para la matriz");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

                int numeros = leer.nextInt();

                matriz[i][j] = numeros;
            }

        }
        System.out.println("Mostrar matriz: ");
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

                System.out.print("[ " + matriz[i][j] + " ]");

            }
            System.out.println(" ");

        }
        System.out.println("Transpuesta Negativo: ");
        int matrizN[][] = new int[tamanio][tamanio];
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                matrizN[i][j] = ((matriz[i][j]) * -1);
                System.out.print("[ " + matrizN[i][j] + " ]");
            }
            System.out.println(" ");
        }
        System.out.println("Comparación:  ");
        int contador = 0;
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if (matriz[i][j] != matrizN[j][i]) {
                    contador++;
                }
            }

        }
        if (contador >= 1) {
            System.out.println("No es antisimétrica");
        } else {
            System.out.println("Es antisimétrica");
        }
    }

}
