/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
public class EjercicioBucle3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean repe = true;
        String captura = "p" ;
        
        while(repe == true && !captura.equals("salir")){
        
    
        System.out.println("Ingres cualquier palabra menos SALIR");
        
        Scanner teclado = new Scanner(System.in);
        
         captura = teclado.nextLine().toLowerCase();
        
        System.out.println("Ingresaste : " + captura);
     
            
         System.out.println("Es diferente de salir ingresaste" + captura);
        
        
        if(captura.equals("salir")){
            repe = false;
        }
    }
        System.out.println("HASTA PRONTO INGRESASTE: " + captura);
        // TODO code application logic here
    }
    
}
