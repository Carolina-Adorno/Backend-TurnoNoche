package Eje1Guia7Extra;

import java.util.Scanner;

/*Desarrollar una clase Cancion con los siguientes atributos: título y autor. */
public class cancion {

    public String titulo;
    public String autor;

    /*Se deberá definir además dos constructores: uno vacío que inicializa el título y el autor a cadenas vacías
y otro que reciba como parámetros el título y el autor de la canción. */
    public cancion() {
        this.titulo = "";
        this.autor = "";
    }

    public cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    /*Se deberán además definir los métodos getters y setters correspondientes.*/

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

}
