package main;

import Eje2Guia7Extra.puntos;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        puntos cuenta1 = new puntos();
        Scanner leer = new Scanner(System.in);
        cuenta1.crearPuntos();
        cuenta1.calcularDistancia();
        System.out.println("La distancia es: " + cuenta1.calcularDistancia());

    }
}
