package Guia3;

import java.util.Scanner;
/*Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
*/

public class Ejercicio8Guia {
    public static void main(String[] args) {
        System.out.println("Ingrese una nota entre 0 y 10");
       Scanner leer = new Scanner(System.in);
        int nota = leer.nextInt();

        while(nota<0 || nota>10){
            System.out.println("Nota incorrecta. Ingrese una nota entre 0 y 10");
            nota = leer.nextInt();
       }
        System.out.println("Nota correcta");
    }
}
