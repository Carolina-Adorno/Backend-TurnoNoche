/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**Crear un programa que dado un
 * número determine si es par o impar.
 *
 * @author alvar
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        
    System.out.println("Ingrese un número y se dirá si es par o impar");
        Scanner leer = new Scanner(System.in);
        int num = leer.nextInt();
        
        if(num % 2 == 0){
            System.out.println("El número es par");
        }else {
            System.out.println("El número es impar");
        } 
    }
  
   
}
