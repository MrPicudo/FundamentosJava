package p37_proyectofinaldom;

public class Monitor {
    
    /* ATRIBUTOS */
    private final int idMonitor;
    private String marca;
    private double tamaño;
    private static int contadorMonitores;
    
    /* CONSTRUCTORES */
    private Monitor() {
        this.idMonitor = ++Monitor.contadorMonitores;
    }
    
    public Monitor(String marca, double tamaño) {
        this(); // Mandamos a llamar el constructor privado para que se inicialice la variable idMonitor.
        this.marca = marca;
        this.tamaño = tamaño;
    }
    
    /* MÉTODOS */
    public int getIdMonitor() {
        return this.idMonitor;
    }
    
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public double getTamaño() {
        return this.tamaño;
    }
    
    public void setTamaño(double tamaño) {
        this.tamaño = tamaño;
    }
    
    public int getContadorMonitores() {
        return Monitor.contadorMonitores;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor[");
        sb.append("idMonitor: ").append(this.idMonitor);
        sb.append(", marca: ").append(this.marca);
        sb.append(", tamaño: ").append(this.tamaño);
        sb.append(", contadorMonitores: ").append(Monitor.contadorMonitores);
        sb.append("]");
        return sb.toString();
    }
    
}
