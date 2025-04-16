/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
// Clase para niños
public class Nino extends Visitante {
    private double altura; // En metros

    public Nino(String nombre, String id, double saldo, double altura) throws ParqueException {
        super(nombre, id, saldo);
        if (altura <= 0) {
            throw new ParqueException("La altura debe ser mayor a 0.");
        }
        this.altura = altura;
    }

    @Override
    public boolean puedeAcceder(Atraccion atraccion) {
        // Niños solo acceden a atracciones con altura límite < 1.5m
        return altura < 1.5 && !(atraccion instanceof MontanaRusa); // Ejemplo: no acceden a montañas rusas
    }
}