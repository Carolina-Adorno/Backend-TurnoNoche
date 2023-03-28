/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3;

import java.util.Scanner;

/**
 *Realizar un programa que pida dos números enteros positivos por teclado y muestre 
 * por pantalla el siguiente menú:El usuario deberá elegir una opción y el programa deberá mostrar 
 * el resultado por pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija
 * la opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa 
 * directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que desea 
 * salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
 * caso contrario se vuelve a mostrar el menú.
 * @author alvar
 */

public class Ejercicio6 {
    private static void menu() {
        System.out.println("---------- MENU ----------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.print("Ingrese una Opción: ");
    }
    public static void main(String[] args) {
        int num1, num2, opcion=0;
        String decision;
        Scanner leer=new Scanner(System.in);
        do{
            System.out.println("Ingrese dos números");
            num1=leer.nextInt();
            num2=leer.nextInt();
        }while (num1<0 && num2<0);
        do{
            menu();
            opcion=leer.nextInt();
            switch(opcion){
                
                case 1: System.out.println(num1+num2); 
                break;
                case 2:System.out.println(num1-num2); 
                break;
                case 3:System.out.println(num1*num2); 
                break;
                case 4:System.out.println(num1/num2); 
                break; 
                case 5: System.out.println("Saliendo");
                if(opcion==5){
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
               decision=leer.next();
               if(decision.equals("s")){
                   System.out.println("Finalizado");
                   break;
               }else {
                   System.out.println("Volviendo al menu");
                 opcion=0;
               }
                }
            }
        }while(opcion!=5);
    }
}
