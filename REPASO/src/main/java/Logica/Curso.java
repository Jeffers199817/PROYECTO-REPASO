/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author JEFFERSON
 */
public class Curso {
    
    String nombre;
    String duracion;
    String modalidad;
    boolean posee_cert;
    
    
    public Curso(String nomrbe, String duracion, String modalidad, boolean posee_cert){ 
        this.nombre = nombre;
        this.duracion = duracion;
        this.modalidad = modalidad;
        this.posee_cert = posee_cert;
    }
    
    
    public String getNombre(){
        return nombre;
    }
    public String getDuracion(){ 
        return duracion;
    }
    public String getModalidad(){
        return modalidad;
    }
    public boolean getPosee_cert(){
        return posee_cert;
    }
    
    public void setNombre(String nombre){ 
        this.nombre = nombre;
        
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setModalidad(String modalidad) {
        this.modalidad = modalidad;
    }

    public void setPosee_cert(boolean posee_cert) {
        this.posee_cert = posee_cert;
    }
    
    
}
