package p37_proyectofinaldom;

public class DispositivoEntrada {
    
    /* ATRIBUTOS */
    protected String tipoEntrada;
    protected String marca;
    
    /* CONSTRUCTORES */
    public DispositivoEntrada(String tipoEntrada, String marca) {
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }
    
    /* MÉTODOS */
    
    // Get y set del atributo protegido tipoEntrada
    public String getTipoEntrada() {
        return this.tipoEntrada;
    }
    
    public void setTipoEntrada(String tipoEntrada) {
        this.tipoEntrada = tipoEntrada;
    }
    
    // Get y set del atributo protegido marca
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // Método toString de la clase    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DispositivoEntrada[");
        sb.append("tipoEntrada: ").append(tipoEntrada);
        sb.append(", marca: ").append(marca);
        sb.append("]");
        return sb.toString();
    }
    
}
