package Guia4;

import java.util.Scanner;

/*Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro
para que nos indique si es o no un número primo, debe devolver true si es primo, sino false.
Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, 
ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */

public class Ejercicio4A {

    public static void main(String[] args) {
        System.out.println("Ingrese un número entero para verificar si es primo de alguien!");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        primo(num);
    }

    public static boolean primo(int num) {
    int contador=0;
    for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador++;
             }
            if (contador > 2) {
                System.out.println("El número no es primo");
                break;
            }
    } return contador <= 2;
    }
    }



/* NICOOOOO!!!!!!!!!!!!!!!!!!!!!!!!
LA CARPETA Q TENES
CLICK DERECHO
GIT BASH HERE
SE ABRE GIT BASH HERE
ENTRA LOS COMANDOS
git status
git add .
git commit -m "un mensaje x"
git push origin main
git status
estos son los comandos q siempre usas para actualizar el git
despues vas a github y tienen q salir
*/
     
