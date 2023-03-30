package Guia2;

import java.util.Scanner;

public class Ejercicio1 {
/*Escribir un programa que pida dos números enteros
por teclado y calcule la suma de los dos. El programa deberá después mostrar 
el resultado de la suma*/   
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("Ingrese dos números");
        Scanner leer= new Scanner(System.in);
        num1=leer.nextInt();
        num2=leer.nextInt();  
        System.out.println("El resultado es: " + (num1+num2));
    }
}
