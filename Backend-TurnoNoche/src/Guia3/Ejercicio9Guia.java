package Guia3;

import java.util.Scanner;
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle y 
mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la 
suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break.
*/

public class Ejercicio9Guia {
    public static void main(String[] args) {
        System.out.println("Ingrese 20 números");
        Scanner leer = new Scanner(System.in);
         int num = leer.nextInt();
         int suma = 0;
         int cantidad = 0;
         do{
             System.out.println("Ingrese otro número");
         num=leer.nextInt();
         cantidad++;
         suma += num;
         if (num>0){
             continue;
         }
            if(num==0){
              System.out.println("Se capturó el número 0"); 
              break;
            }
        }while (cantidad<20);
         
       System.out.println("La suma de los números leídos es: " + suma);
         
   }
}