package p37_proyectofinaldom;

public class Raton extends DispositivoEntrada {
    
    /* ATRIBUTOS */
    private final int idRaton;
    private static int contadorRatones;
    
    /* CONSTRUCTORES */
    public Raton(String tipoEntrada, String marca) {
        super(tipoEntrada, marca); // Así mandamos a llamar el constructor de la clase padre (Esto causaba el problema de "error parsing file" al agregar el extends.
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
        sb.append(", herencia: ").append(super.toString()); // Así mostramos la información de los atributos heredados.
        sb.append("]");
        return sb.toString();    
    }
    
}
