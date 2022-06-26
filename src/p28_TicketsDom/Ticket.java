// Este programa estudia el concepto de contexto estático para atributos y métodos.

package p28_TicketsDom;

public class Ticket {
    
    /* ATRIBUTOS */
    private int idTicket;
    private double monto;
    private static int contador; // Este atributo está relacionado con la clase Ticket por ser estático.
    private static double total;
    
    /* CONSTRUCTOR */
    public Ticket(double monto) {
        this.monto = monto;
        // Incrementamos el valor del contador, que se inicializó en cero por default.
        Ticket.contador++;
        // Asignamos el valor actual del contador al atributo dinámico idTicket.
        this.idTicket = Ticket.contador;
        // Sumamos la cuenta del ticket actual a la venta total.
        Ticket.total += this.monto;
    }
    
    /* MÉTODOS */
    
    // Get y set del atributo dinámico idTicket
    public int getIdTicket() {
        return this.idTicket;
    }
    
    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }
    
    // Get y set del atributo dinámico monto
    public double getMonto() {
        return this.monto;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    // Get y set del atributo estático contador
    public static int getContador() {
        return Ticket.contador; // Usamos la clase y no la variable this para acceder a un atributo estático.
    }
    
    public static void setContador(int contador) {
        Ticket.contador = contador;
    }
    
    // Get y set del atributo estático total
    public static double getTotal() {
        return Ticket.total;
    }
    
    public static void setTotal(double total) {
        Ticket.total = total;
    }
    
    // Método toString() de la clase Ticket
    @Override // Usamos Overrride para indicar que estamos modificando un método que ya existe en la clase padre Object.
    public String toString() {
        return "Ticket[idTicket: " + this.idTicket +
                ", monto: " + this.monto +
                ", total: " + Ticket.total +
                ", contador: " + Ticket.contador + "] \n";
    }
    
}
