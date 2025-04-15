package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("============================================================");
            System.out.println("Hola bienvenido al sistema:");
        System.out.println("============================================================");
        System.out.println("");
        System.out.print("Ingrese el número limite a repetir: ");
            Scanner keyboard = new Scanner(System.in);
            int limitNumber = keyboard.nextInt();

            int centinela=0;

            while(centinela<=limitNumber){

                System.out.println("El número es: " + centinela);

                centinela++;
            }
        System.out.println("FIN DEL PROGRAMA VUELVA PRONTO, NÚMERO LIMITE FUE DE:  " + limitNumber);

    }
}