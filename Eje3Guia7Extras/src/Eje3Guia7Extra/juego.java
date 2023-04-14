package Eje3Guia7Extra;

import java.util.Scanner;

public class juego {

    public int jugador1;
    public int jugador2;

    public juego() {
    }

    /*Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores jugar
un juego de adivinanza de números. El primer jugador elige un número y el segundo jugador intenta
adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe una pista de "más alto" 
o "más bajo" después de cada intento. El juego termina cuando el segundo jugador adivina el número
o se queda sin intentos. Registra el número de intentos necesarios para adivinar el número y el número
de veces que cada jugador ha ganado.
     */
    public void iniciar_juego() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Jugador1 : Ingrese un número a adivinar.");
        jugador1 = leer.nextInt();
        int intentos = 3;
        while (intentos > 0) {
            System.out.println("Jugador2 : Intente adivinar el número ingresado. Tiene hasta "+ intentos +" intentos.");
            jugador2 = leer.nextInt();
            if (jugador2==jugador1){
                System.out.println("Adivinaste el número. Winner");
                break;
            }else if (jugador2<jugador1){
                System.out.println("Número incorrecto");
                System.out.println("Pista: El número a adivinar es mayor");
            intentos--;
            }else {
              System.out.println("Número incorrecto");
                System.out.println("Pista: El número a adivinar es menor");
                intentos--;
            }
           if (intentos==0){
               System.out.println("Perdedor");
               System.out.println("Gano Jugador1");
           }         
        }

    }
}
