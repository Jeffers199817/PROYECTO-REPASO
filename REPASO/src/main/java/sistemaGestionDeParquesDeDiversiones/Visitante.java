/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
// Clase abstracta para visitantes
public abstract class Visitante {
    private final String nombre;
    private final String id;
    private double saldo;

    public Visitante(String nombre, String id, double saldo) throws ParqueException {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new ParqueException("El nombre del visitante no puede estar vacío.");
        }
        if (id == null || id.trim().isEmpty()) {
            throw new ParqueException("El ID del visitante no puede estar vacío.");
        }
        if (saldo < 0) {
            throw new ParqueException("El saldo no puede ser negativo.");
        }
        this.nombre = nombre;
        this.id = id;
        this.saldo = saldo;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    // Setter protegido
    protected void setSaldo(double saldo) throws ParqueException {
        if (saldo < 0) {
            throw new ParqueException("El saldo no puede ser negativo.");
        }
        this.saldo = saldo;
    }

    // Método abstracto
    public abstract boolean puedeAcceder(Atraccion atraccion);

    // Método para pagar entrada
    public void pagarEntrada(Atraccion atraccion) throws ParqueException {
        double costo = atraccion.getCostoEntrada();
        if (this instanceof Adulto) {
            costo *= 1.2; // 20% más para adultos
        }
        if (saldo < costo) {
            throw new ParqueException("Saldo insuficiente para " + atraccion.getNombre());
        }
        if (!puedeAcceder(atraccion)) {
            throw new ParqueException("El visitante no puede acceder a " + atraccion.getNombre());
        }
        saldo -= costo;
    }

    // Método para mostrar información
    public String mostrarInformacion() {
        return String.format("Visitante: %s\nID: %s\nSaldo: $%.2f", nombre, id, saldo);
    }
}