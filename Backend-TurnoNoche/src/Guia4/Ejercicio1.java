package Guia4;

import java.util.Scanner;

/*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar 
y dividir. La aplicación debe tener una función para cada operación matemática y deben devolver sus
resultados para imprimirlos en el main. 
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Ingrese dos números");
        Scanner leer = new Scanner(System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        System.out.println("Elija una operación a realizar para dichos números:");
        System.out.println("1-Sumar");
        System.out.println("2-Restar");
        System.out.println("3-Multiplicar");
        System.out.println("4-Dividir");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("El resultado de la suma es: " + sumar(num1, num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + restar(num1, num2));
                break;
                case 3:
                System.out.println("El resultado de la multiplicación es: " + multi(num1, num2));
                break;
                case 4:
                 divi(num1, num2);
                break;
        }

    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;
        resta = num1 - num2;
        return resta;
    }
 public static int multi(int num1, int num2) {
        int multiplicar;
        multiplicar = num1 * num2;
        return multiplicar;
    }
public static int divi(int num1, int num2) {
        int division;
        division = num1 / num2;
        System.out.println("El resultado de la división es: " + division);
        return division;
    }
}
