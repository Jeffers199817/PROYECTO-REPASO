/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
public abstract class Atraccion{
    
    private final String nombre;
    private int capacidadMaxima;
    private double costoEntrada;
    int tiempoDuracion;

    public Atraccion(String nombre, int capacidadMaxima, double costoEntrada, int tiempoDuracion) throws ParqueException{
        
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ParqueException("El nombre de la atracción no puede estar vacío.");
        }
        if (capacidadMaxima <= 0) {
            throw new ParqueException("La capacidad máxima debe ser mayor a 0.");
        }
        if (costoEntrada < 0) {
            throw new ParqueException("El costo de entrada no puede ser negativo.");
        }
        if (tiempoDuracion <= 0) {
            throw new ParqueException("La duración debe ser mayor a 0.");
        }
        
        this.nombre = nombre;
        this.capacidadMaxima = capacidadMaxima;
        this.costoEntrada = costoEntrada;
        this.tiempoDuracion = tiempoDuracion;
    }

// Getters
    public String getNombre() {
        return nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public double getCostoEntrada() {
        return costoEntrada;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    // Setters protegidos para modificar solo desde subclases
    protected void setCapacidadMaxima(int capacidadMaxima) throws ParqueException {
        if (capacidadMaxima <= 0) {
            throw new ParqueException("La capacidad máxima debe ser mayor a 0.");
        }
        this.capacidadMaxima = capacidadMaxima;
    }

    protected void setCostoEntrada(double costoEntrada) throws ParqueException {
        if (costoEntrada < 0) {
            throw new ParqueException("El costo de entrada no puede ser negativo.");
        }
        this.costoEntrada = costoEntrada;
    }

    // Métodos abstractos
    public abstract double calcularCostoOperacion();
    public abstract String generarInforme();
}