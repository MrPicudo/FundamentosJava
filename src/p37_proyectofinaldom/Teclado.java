package p37_proyectofinaldom;

public class Teclado extends DispositivoEntrada {
    
    /* ATRIBUTOS */
    private final int idTeclado;
    private static int contadorTeclados;
    
    /* CONSTRUCTORES */
    public Teclado(String tipoEntrada, String marca) {
        super(tipoEntrada, marca);
        this.idTeclado = ++Teclado.contadorTeclados;
    }
    
    /* MÉTODOS */
    public int getIdTeclado() {
        return this.idTeclado;
    }
    
    public int getContadorTeclados() {
        return Teclado.contadorTeclados;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teclado[");
        sb.append("idTeclado: ").append(this.idTeclado);
        sb.append(", contadorTeclados: ").append(Teclado.contadorTeclados);
        sb.append(", herencia: ").append(super.toString()); // Así mostramos la información de los atributos heredados.
        sb.append("]");
        return sb.toString();
    }
    
}
