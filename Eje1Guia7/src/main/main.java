package main;

import Eje1Guia7.Libro;


   
public class main {
    public static void main(String[] args) {
        Libro libro1 = new Libro();
   libro1.cargarDatos();
   Libro libro2 = new Libro();
   libro2.cargarDatos();
   
        System.out.println("El ISBN es: "+libro1.ISBN);
        System.out.println("El titulo es: "+libro1.titulo);
        System.out.println("El autor es: "+libro1.autor);
        System.out.println("La cantidad de pagina es: "+libro1.paginas);
        System.out.println("----------------------------------------");
        System.out.println("El ISBN es: "+libro2.ISBN);
        System.out.println("El titulo es: "+libro2.titulo);
        System.out.println("El autor es: "+libro2.autor);
        System.out.println("La cantidad de pagina es: "+libro2.paginas);
    }
}
