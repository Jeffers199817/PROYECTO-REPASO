/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica;

import java.time.LocalDate;

/**
 *
 * @author JEFFERSON
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Alumno alumno = new Alumno(14533452,"Alquinga","Jefferson", "puembo",LocalDate.of(1998,12,8) ,4234234);
        
        
        System.out.println("Bienvenido este son los alumnos que no aporbarodn");
        
        alumno.mostrarMensaje();
        alumno.saberAprobado(9);
        
        System.out.println("Mis datos completos son.");
        System.out.println(alumno);
    }
    
   
    
}
