package p37_proyectofinaldom;

public class Raton {
    
    /* ATRIBUTOS */
    private final int idRaton;
    private static int contadorRatones;
    
    /* CONSTRUCTORES */
    public Raton() {
        this.idRaton = ++Raton.contadorRatones;
    }
    
    /* MÉTODOS */
    public int getIdRaton() {
        return this.idRaton;
    }
    
    public int getContadorRatones() {
        return Raton.contadorRatones;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Raton[");
        sb.append("idRaton: ").append(this.idRaton);
        sb.append(", contadorRatones: ").append(Raton.contadorRatones);
        sb.append("]");
        return sb.toString();    
    }
    
}
