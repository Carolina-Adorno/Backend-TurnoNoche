package Guia4;

import java.util.Scanner;

/*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas
ingresadas por teclado e indique si son mayores o menores de edad. Después de cada persona, el programa 
debe preguntarle al usuario si quiere seguir mostrando personas y frenar cuando el usuario ingrese
la palabra “No”.
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de personas a mostrar datos");
        Scanner leer = new Scanner(System.in);
        int personas = leer.nextInt();
        datos(personas);
           
    }

    public static void datos(int personas) {

        for (int i = 0; i < personas; i++) {

            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese el nombre");
            String nombre = leer.nextLine();
            System.out.println("Ingrese la edad");
            int edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }

        }
    }
}
