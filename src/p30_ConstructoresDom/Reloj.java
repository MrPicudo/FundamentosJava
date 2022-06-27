package p30_ConstructoresDom;

public class Reloj {
    
    /* ATRIBUTOS */
    protected int hora, minuto;
    private int segundo;
    
    /* CONSTRUCTORES */
    
    // Constructor vacío, manda a llamar al constructor de la clase Object.
    public Reloj() {}
    
    // Constructor completo
    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    
    /* MÉTODOS */
    
    // Get y set del atributo protected hora
    public int getHora() {
        return this.hora;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    
    // Get y set del atributo protected minuto
    public int getMinuto() {
        return this.minuto;
    }
    
    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    // Get y set del atributo protected segundo
    public int getSegundo() {
        return this.segundo;
    }
    
    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    // Método toString para todos los objetos de la clase Reloj
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Reloj[");
        sb.append("hora: ").append(hora);
        sb.append(", minuto: ").append(minuto);
        sb.append(", segundo: ").append(segundo);
        sb.append(']');
        return sb.toString();
    }
    
}
