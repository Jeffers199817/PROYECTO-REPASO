/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author JEFFERSON
 */
public class Ejercicio4 {
    
    public static void main(String[] args){
    
    int vector[] = new int [4];
    Scanner teclado = new Scanner(System.in);
    
        
        
        for(int i=0; i<vector.length; i++){
            System.out.println("Cantidad de número a ingresar: " + vector.length);
            
            
            boolean centinela = false;
            
            while(!centinela){
                
            try{
                    System.out.print("Ingrese un número " + (i+1) + " : ");
            vector[i] = teclado.nextInt();
            System.out.println("Número ingresado " + vector[i] + " en la posición " + (i+1));
                centinela=true;
             
            }catch(java.util.InputMismatchException e){
                
                System.out.println("Error: Por favor, ingrese solo números enteros.");
                teclado.next();
                
                
            }   
       
            }
            
            
        }
        
        System.out.println("====================================");
        System.out.println("El vector completo es:");
        
         System.out.print("{ ");
        for(int j = 0; j<vector.length; j++){ 
            
            System.out.print( j + ", ");
        }
        System.out.print(" }");
        
        
        System.out.println("Fin del Vector.");
    

}
}