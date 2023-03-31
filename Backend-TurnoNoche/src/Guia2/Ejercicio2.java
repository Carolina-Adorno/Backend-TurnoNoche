package Guia2;

import java.util.Scanner;
/*Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por pantalla.

*/

public class Ejercicio2 {
    public static void main(String[] args) {
        System.out.println("Ingresa tu nombre");
        Scanner leer = new Scanner(System.in);
        String nombre=leer.next();
        System.out.println("Tu nombre es: "+nombre);
    }
}
