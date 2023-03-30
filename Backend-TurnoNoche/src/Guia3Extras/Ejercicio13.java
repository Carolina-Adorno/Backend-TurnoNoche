package Guia3Extras;

import java.util.Scanner;

/*Crear un programa que dibuje una escalera de números, donde cada línea de números comience en
uno y termine en el número de la línea. Solicitar la altura de la escalera al usuario al comenzar.
Ejemplo: si se ingresa el número 3:
1
12
123
*/

public class Ejercicio13 {
    public static void main(String[] args) {
        int altura;
        System.out.println("Ingrese la altura de la escalera");
        Scanner leer = new Scanner(System.in);
        altura=leer.nextInt();
        for (int i = 0; i < altura; i++) {
            int num = i+1;
            for (int j = 0; j < num; j++) {
                System.out.print(j+1); 
                
            }
            System.out.println();
        }
        
    }
}
