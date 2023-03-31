package Guia4;

import java.util.Scanner;
/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, 
multiplicar y dividir. La aplicación debe tener una función para cada operación matemática y deben
devolver sus resultados para imprimirlos en el main. 
*/

public class Ejercicio1A {
    public static void main(String[] args) {
        
        System.out.println("Ingrese dos números enteros");
        Scanner leer = new Scanner(System.in);
        
        int num1=leer.nextInt();
        int num2=leer.nextInt();
        
        System.out.println("Elegir una opción\n1-Sumar\n2-Restar\n3-Multplicar\n4-Dividir");
        int opcion = leer.nextInt();
        
        switch(opcion){
            case 1:
                System.out.println("El resultado es: "+ sumar(num1,num2));
            break;
            case 2:
                System.out.println("El resultado es: "+restar(num1,num2));
                break;
            case 3:
                System.out.println("El resultado es: "+multiplicar(num1,num2));
                break;
            case 4:
                System.out.println("El resultado es "+division(num1,num2));
                break;
            default:
                System.out.println("Finalizado");
                break;
               
        }
    }
    public static int sumar(int num1, int num2){
        int suma= num1+num2;
        return suma;
    }
    public static int restar(int num1, int num2){
        int resta=num1-num2;
        return resta;
      }
    public static int multiplicar(int num1, int num2){
        int multi=num1*num2;
        return multi;
    }
    public static int division(int num1, int num2){
        int divi=num1/num2;
        return divi;
    }
}
