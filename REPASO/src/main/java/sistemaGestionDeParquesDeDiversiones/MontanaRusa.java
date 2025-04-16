/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
// Clase para montañas rusas
public class MontanaRusa extends Atraccion implements MaterialReservable {
    private int numeroLoops;
    private int boletosReservados;

    public MontanaRusa(String nombre, int capacidadMaxima, double costoEntrada, 
            int tiempoDuracion, int numeroLoops) throws ParqueException {
        super(nombre, capacidadMaxima, costoEntrada, tiempoDuracion);
        if (numeroLoops < 0) {
            throw new ParqueException("El número de loops no puede ser negativo.");
        }
        this.numeroLoops = numeroLoops;
        this.boletosReservados = 0;
    }

    @Override
    public double calcularCostoOperacion() {
        return getCostoEntrada() * getCapacidadMaxima() + (numeroLoops * 50); // $50 por loop
    }

    @Override
    public String generarInforme() {
        return String.format("Atracción: %s\nTipo: Montaña Rusa\nCapacidad: %d\nDuración: %d min\n" +
                "Costo Entrada: $%.2f\nCosto Operación: $%.2f\nBoletos Reservados: %d",
                getNombre(), getCapacidadMaxima(), getTiempoDuracion(), getCostoEntrada(),
                calcularCostoOperacion(), boletosReservados);
    }

    @Override
    public void reservarBoleto(int cantidad) throws ParqueException {
        if (cantidad <= 0) {
            throw new ParqueException("La cantidad de boletos debe ser mayor a 0.");
        }
        if (boletosReservados + cantidad > getCapacidadMaxima()) {
            throw new ParqueException("No hay suficiente capacidad para reservar " + cantidad + " boletos.");
        }
        boletosReservados += cantidad;
    }

    @Override
    public void cancelarReserva(int cantidad) throws ParqueException {
        if (cantidad <= 0) {
            throw new ParqueException("La cantidad de boletos a cancelar debe ser mayor a 0.");
        }
        if (boletosReservados < cantidad) {
            throw new ParqueException("No hay suficientes boletos reservados para cancelar.");
        }
        boletosReservados -= cantidad;
    }
}