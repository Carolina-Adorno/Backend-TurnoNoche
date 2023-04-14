package main;

import Eje1Guia7Extra.cancion;
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        cancion cancion1 = new cancion();
        cancion cancion2 = new cancion("The Astronaut", "Jin");
        
        cancion1.setAutor("Stray Kids");
        cancion1.setTitulo("Maniac");
        
        System.out.println("Primer cancion: "+ cancion1.getTitulo()+ " de "+ cancion1.getAutor());
        System.out.println("Segunda cancion: "+ cancion2.getTitulo()+ " de "+ cancion2.getAutor());
    }
}
