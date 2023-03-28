/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**Crear un programa que pida una frase y 
 * si esa frase es igual a “eureka” el programa pondrá 
 * un mensaje de Correcto, sino mostrará un mensaje
 * de Incorrecto. Nota: investigar la función equals() en Java.
 *
 * @author alvar
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        String palabra;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        palabra=leer.nextLine();
        if (palabra.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
