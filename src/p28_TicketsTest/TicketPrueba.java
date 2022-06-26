// Este programa está pensado para estudiarse mediante el modo debug.
package p28_TicketsTest;

import p28_TicketsDom.Ticket;

public class TicketPrueba {
    public static void main(String[] args) {
        // Creamos el primer objeto
        Ticket venta1 = new Ticket(169.00);
        System.out.println("venta1 = " + venta1);
        // Creamos el 2do objeto
        Ticket venta2 = new Ticket(290.00);
        System.out.println("venta2 = " + venta2);
        // Creamos el 3er objeto
        Ticket venta3 = new Ticket(37.00);
        System.out.println("venta3 = " + venta3);
        // Creamos el 4to objeto
        Ticket venta4 = new Ticket(529.00);
        System.out.println("venta4 = " + venta4);
    }
}
