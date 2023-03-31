package Guia2;

import java.util.Scanner;

/*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit. 
La fórmula correspondiente es: F = 32 + (9 * C / 5).

*/
public class Ejercicio4 {
    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de grados centígrados");
        Scanner leer = new Scanner(System.in);
        int grados = leer.nextInt();
        int f = 32 + (9* grados/5);
        System.out.println("Su equivalencia es: "+ f + " Fahrenheit");

    }
}
