/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
public class matrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("===================================");
        System.out.println("BIENVENIDO AL SISTEMA DE INGRESA Y EMPRIME LA MATRIZ A");
        System.out.println("===================================");
        
        //VARIANLES
        int matrizA[][] = new int[4][6];
        
        Scanner teclado = new Scanner(System.in);
        int contador = 1;

        
        for(int i=0; i<matrizA.length; i++){
            
            
            for(int j=0; j<matrizA[i].length; j++){
                boolean centinela=false;
            while(!centinela){
                
                try{
                    
                    
                    System.out.print("Ingrese el número: " + contador +" de la matrizA en la posición: ["+ i + "]" + "[" + j + "]" + ": ");
                    
                    matrizA[i][j] = teclado.nextInt();
                    centinela=true;
                    
                    System.out.println("Número: " + matrizA[i][j] +" Ingresado Correctamente.");
                    
                    System.out.println("===================================================");
                    
                

                }catch(java.util.InputMismatchException e){
                    
                    System.out.println("Error: Porfavor. Ingrese solo números enteros.");
                    
                    teclado.next();
                    
                }
                
            }
            contador++;
            
            }

            
            
            
        }
        System.out.println("LA MATRIZ A COMPLETA ES:");
        for(int f=0; f<matrizA.length; f++){
            
            System.out.print("| ");
            
            for(int k=0; k<matrizA[f].length; k++){
                
                System.out.print(matrizA[f][k]);
                System.out.print(" ");
                
            }
                System.out.print(" |");
                System.out.println(" ");
        }
        
              
                System.out.println("FIN DEL PROGRAMA VUELVA PROPNTO.");
                
        
                
        
      
    }
    
}
