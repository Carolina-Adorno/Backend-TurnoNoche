package Guia3;

import java.util.Scanner;

/*Implementar un programa que le pida dos números enteros al usuario y determine si ambos o alguno
de ellos es mayor a 25.
 */

public class Ejercicio6Guia {

    public static void main(String[] args) {
        System.out.println("Ingrese dos números enteros");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        if (num1 > 25 && num2 > 25) {
            System.out.println("Ambos son mayor a 25");
        } else if (num1 > 25) {
            System.out.println("Uno es mayor a 25");
        } else if (num2 > 25) {
            System.out.println("Uno es mayor a 25");
        } else {
            System.out.println("Ninguno es mayor a 25");
        }
    }
}
