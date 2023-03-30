package Guia3Extras;

import java.util.Scanner;

/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.*/

public class Ejercicio3 {
    public static void main(String[] args) {
        System.out.println("Ingrese una letra");
        String letra;
        Scanner leer = new Scanner(System.in);
        letra = leer.next();
        letra = letra.toUpperCase();
        if (letra.equals("A") || letra.equals("E") || letra.equals("I") || letra.equals("O") || letra.equals("U")){
            System.out.println("La letra es una vocal");
        } else {
            System.out.println("La letra es una consonante");
        }
    }
}
