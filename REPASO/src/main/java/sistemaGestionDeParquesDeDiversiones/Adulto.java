/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
// Clase para adultos
public class Adulto extends Visitante {
    public Adulto(String nombre, String id, double saldo) throws ParqueException {
        super(nombre, id, saldo);
    }

    @Override
    public boolean puedeAcceder(Atraccion atraccion) {
        return true; // Los adultos pueden acceder a todas las atracciones
    }
}