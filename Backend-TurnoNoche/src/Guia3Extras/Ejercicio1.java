package Guia3Extras;

import java.util.Scanner;

/*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 
1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas*/

public class Ejercicio1 {
    public static void main(String[] args) {
        int dia, hora, minutos, minutosRestantes;
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese los minutos a calcular");
        minutos = leer.nextInt();
        dia = minutos/1440;
        minutosRestantes = minutos % 1440;
        hora = minutosRestantes / 60;
        System.out.println("Su equivalencia en dias es: "+dia+" dia y horas: "+hora);
     
   
    }
}
