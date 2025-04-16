/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package sistemaGestionDeParquesDeDiversiones;

/**
 *
 * @author JEFFERSON
 */
public interface MaterialReservable {
    
   void reservarBoleto(int cantidad) throws ParqueException;
   void cancelarReserva(int cantidad) throws ParqueException;
    
}
