/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
// Clase para carruseles
public class Carrusel extends Atraccion {
    private int numeroPasajeros;

    public Carrusel(String nombre, int capacidadMaxima, double costoEntrada, 
            int tiempoDuracion, int numeroPasajeros) throws ParqueException {
        super(nombre, capacidadMaxima, costoEntrada, tiempoDuracion);
        if (numeroPasajeros < 0 || numeroPasajeros > capacidadMaxima) {
            throw new ParqueException("El número de pasajeros debe estar entre 0 y la capacidad máxima.");
        }
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public double calcularCostoOperacion() {
        return 100 + (numeroPasajeros * 5); // Costo fijo + $5 por pasajero
    }

    @Override
    public String generarInforme() {
        return String.format("Atracción: %s\nTipo: Carrusel\nCapacidad: %d\nDuración: %d min\n" +
                "Costo Entrada: $%.2f\nCosto Operación: $%.2f\nPasajeros Actuales: %d",
                getNombre(), getCapacidadMaxima(), getTiempoDuracion(), getCostoEntrada(),
                calcularCostoOperacion(), numeroPasajeros);
    }
}