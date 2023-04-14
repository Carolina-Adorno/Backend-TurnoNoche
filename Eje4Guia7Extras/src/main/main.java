package main;

import Eje4Guia7Extra.cuenta;



public class main {
    public static void main(String[] args) {
        cuenta cuenta1 = new cuenta(5000, "Fulanito");
        
        System.out.println("Saldo inicial "+ cuenta1.getSaldo());
       cuenta1.retirarDinero(6000);
        System.out.println("Saldo restante: "+cuenta1.getSaldo());
        
        
    }
}
