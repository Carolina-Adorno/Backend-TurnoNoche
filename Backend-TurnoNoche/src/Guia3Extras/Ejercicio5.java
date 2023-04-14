package Guia3Extras;

import java.util.Scanner;
/*Una obra social tiene tres clases de socios:
Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en todos los tipos de tratamientos.
Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para los mismos tratamientos 
que los socios del tipo A.
Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real que represente el costo 
del tratamiento (previo al descuento) y determine el importe en efectivo a pagar por dicho socio.
*/

public class Ejercicio5 {
    public static void main(String[] args) {
        System.out.println("Ingrese el tipo de socio");
        Scanner leer = new Scanner(System.in);
        char tipoSocio;
        do 
            tipoSocio
        
     
        switch(tipoSocio){
            case "A":

                break;
            case "B":
                
                break;
            case "C":
                break;
                
       char caracter;
        
        Scanner leer = new Scanner(System.in);
        System.out.println("¿Que tipo de socios sos?");
        System.out.println("Ingrese una opcion");
        System.out.println("Socio A");
        System.out.println("Socio B");
        System.out.println("Socio C");
        
        caracter= (char)System.in.read();
        
        int descuento,tratamiento,cuotA=1500,cuotB=1000,cuotC=500;
        
        if(!"A".equals(caracter)){
            System.out.println("¿Cual es el costo del tratamiento?");
            tratamiento= leer.nextInt();
            descuento=tratamiento-(tratamiento*50)/100;
            System.out.println("El importa a pagar en dicho mes es de $"+(cuotA+descuento));
        } else
            if(!"B".equals(caracter)){
                System.out.println("¿Cual es el costo del tratamiento?");
                tratamiento= leer.nextInt();
                descuento=tratamiento-(tratamiento*35)/100;
                System.out.println("El importa a pagar en dicho mes es de $"+(cuotB+descuento));
        }
          else
            if(!"C".equals(caracter)){
            System.out.println("El importa a pagar en dicho mes es de $"+(cuotC)); 
            }         
    }
}
                
        }
    }
}
