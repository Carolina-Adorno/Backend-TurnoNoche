package Guia4;

import java.util.Scanner;

/*Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se reemplaza por el carácter 
que se indica en la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se mantienen
sin cambios.
a e i o u
@#$%*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.
Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 */
public class Ejercicio11Guia {

    public static void main(String[] args) {

        System.out.println("Ingrese una palabra o frase");
        Scanner leer = new Scanner(System.in);
        String frase = leer.nextLine();
        System.out.println(reemplazo(frase));

    }

    public static String reemplazo(String frase) {
        String letra = "";
        String letraFinal = "";
        for (int i = 0; i < frase.length(); i++) {
            letra = frase.substring(i, i + 1);
            switch (letra) {
                case "a":
                    letraFinal = letraFinal + "@";
                  
                    break;
                case "e":
                    letraFinal = letraFinal + ("#");
                    break;
                case "i":
                    letraFinal = letraFinal.concat("$");
                    break;
                case "o":
                    letraFinal = letraFinal.concat("%");
                    break;
                case "u":
                    letraFinal = letraFinal.concat("*");
                    break;
                default:
                    letraFinal = letraFinal.concat(letra);
                    break;
            }
          
            
        }
        return letraFinal;
    }
}
