package p27_EncapsulamientoDom;

public class Libro {
    
    /* ATRIBUTOS */
    private String titulo;
    private int año;
    private double precio;
    private boolean existencia;
    
    /* CONSTRUCTORES */
    public Libro() {
        // Constructor vacío.
    }
    
    public Libro(String titulo, int año, double precio, boolean existencia) {
        this.titulo = titulo;
        this.año = año;
        this.precio = precio;
        this.existencia = existencia;
    }
    
    /* MÉTODOS */
    
    // Getters y setters del atributo titulo.
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    // Getters y setters del atributo año.
    public int getAño() {
        return this.año;
    }
    
    public void setAño(int año) {
        this.año = año;
    }
    
    // Getters y setters del atributo precio.
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // Getters y setters del atributo existencia (de tipo boolean)*
    public boolean isExistencia() {
        return existencia;
    }

    public void setExistencia(boolean existencia) {
        this.existencia = existencia;
    }
    
    // Método toString para mostrar el estado de los atributos de un objeto.
    @Override // Lo agregamos por el concepto de herencia, ya que toString está relacionado con la clase Object.
    public String toString() {
        return "Libro [titulo: " + this.titulo + 
                ", año: " + this.año + 
                ", precio: " + this.precio +
                ", existencia: " + this.isExistencia() + "]";
    }
    
}
