/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
public class ParqueDiversionesMain {

    public static void main(String[] args) {
        try {
            // Crear atracciones
            Atraccion[] atracciones = new Atraccion[] {
                new MontanaRusa("Tornado", 50, 25.0, 5, 3),
                new Carrusel("Carrusel Mágico", 30, 10.0, 3, 20),
                new CasaTerror("Mansión Embrujada", 20, 15.0, 10, 5)
            };

            // Crear visitantes
            Visitante[] visitantes = new Visitante[] {
                new Adulto("Ana", "A001", 100.0),
                new Adulto("Carlos", "A002", 50.0),
                new Nino("Lucía", "N001", 30.0, 1.2)
            };

            // Mostrar informes de atracciones
            System.out.println("=== Informes de Atracciones ===");
            for (Atraccion atraccion : atracciones) {
                System.out.println(atraccion.generarInforme());
                System.out.println();
            }

            // Reservar boletos
            System.out.println("=== Reservas ===");
            if (atracciones[0] instanceof MaterialReservable) {
                ((MaterialReservable) atracciones[0]).reservarBoleto(10);
                System.out.println("Reservados 10 boletos para " + atracciones[0].getNombre());
            }
            if (atracciones[2] instanceof MaterialReservable) {
                ((MaterialReservable) atracciones[2]).reservarBoleto(5);
                System.out.println("Reservados 5 boletos para " + atracciones[2].getNombre());
            }

            // Procesar accesos
            System.out.println("\n=== Accesos de Visitantes ===");
            for (Visitante visitante : visitantes) {
                System.out.println(visitante.mostrarInformacion());
                for (Atraccion atraccion : atracciones) {
                    try {
                        visitante.pagarEntrada(atraccion);
                        System.out.println("Acceso exitoso a " + atraccion.getNombre());
                    } catch (ParqueException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
                System.out.println(visitante.mostrarInformacion());
                System.out.println();
            }
        } catch (ParqueException e) {
            System.err.println("Error inicial: " + e.getMessage());
        }


    }
    
}
