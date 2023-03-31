package Guia2;

import java.util.Scanner;
/*Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda en minúsculas. 
Nota: investigar la función toUpperCase() y toLowerCase() en Java.
*/

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese una frase");
        Scanner leer = new Scanner(System.in);
        String frase=leer.nextLine();
        System.out.println("Frase en minúscula:");
        System.out.println(frase = frase.toLowerCase());
        System.out.println("Frase en mayúscula:");
        System.out.println(frase = frase.toUpperCase());
    }
}
