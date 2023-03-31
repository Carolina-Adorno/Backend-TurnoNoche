package Guia2;

import java.util.Scanner;
/*Escribir un programa que lea un número entero por teclado y muestre por pantalla el doble, el triple y 
la raíz cuadrada de ese número. 
Nota: investigar la función Math.sqrt().
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese un número entero");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        System.out.println("El doble del número "+ num + " es: " + (num*2));
        System.out.println("El triple del número " + num + " es: " + (num*3));
        double raiz = Math.sqrt(num);
        System.out.println("La raíz cuadrada del número " + num + " es: " + raiz);
    }
}

