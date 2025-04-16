/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

import java.time.LocalDate;


/**
 *
 * @author JEFFERSON
 */
public class Alumno {
    
    private long dni;
    private String apellido;
    private String nombre;
    private String direccion;
    private LocalDate fecha_nac;
    private long telefono;
    
    public Alumno(){
        
    }
    public Alumno(long dni, String apellido, String nombre, String direccion, LocalDate fecha_nac, long telefono){
        
        this.dni = dni;
        this.apellido=apellido;
        this.nombre = nombre; 
        this.direccion = direccion;
        this.fecha_nac = fecha_nac;
        this.telefono = telefono;
    }
    
    public void mostrarMensaje(){ 
        System.out.println("Hola soy un alumno." + "Mi nombre es: " + nombre);
    }
    
    public void saberAprobado(double calificacion){
        
        if(calificacion<=6.99){
            System.out.println("Usted no ha aprobado este curso.");
        }else{
            System.out.println("Aprobación del curso exitoso.");
        }
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Alumno{" + "dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + ", direccion=" + direccion + ", fecha_nac=" + fecha_nac + ", telefono=" + telefono + '}';
    }
    
    
    
    
}
