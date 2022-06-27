package p30_ConstructoresDom;

public class Samsung extends Reloj {
    
    /* ATRIBUTOS */
    private String modelo;
    private double precio;
    private int unidad;
    private static int contador;
    
    /* CONSTRUCTORES */
    
    // Constructor vacío, controla que siempre se contabilice el número de relojes.
    public Samsung() {
        this.unidad = ++Samsung.contador;
    }
    
    // Constructor con todos los atributos propios de la clase Samsung, sin llamar al constructor de la clase Reloj
    public Samsung(String modelo, double precio) {
        this(); // Así mandamos a llamar al constructor vacío de la clase en donde nos encontramos.
        this.modelo = modelo;
        this.precio = precio;
    } 
/*  Los atributos de la clase padre se pasan al usar este constructor porque se heredaron al usar extends, 
    pero los atributos privados no apareden en la lista de la variable this */
    
    // Constructor con todos los atributos de un objeto de la clase reloj
    public Samsung(String modelo, double precio, int hora, int minuto, int segundo) {
        super(hora, minuto, segundo); // Así mandamos a llamar al constructor completo de la clase padre
        this.modelo = modelo;
        this.precio = precio;
        this.unidad = ++Samsung.contador;
    } // Este es el constructor ideal para la subclase creada.
    
    /* MÉTODOS */
    
    // Get y set del atributo privado modelo
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    // Get y set del atributo privado precio
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // Get del atributo privado unidad
    public int getUnidad() {
        return this.unidad;
    }
    
    // Método toString para mostrar todos los atributos de los objetos de esta clase
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Samsung{");
        sb.append("modelo: ").append(modelo);
        sb.append(", precio: ").append(precio);
        sb.append(", unidad: ").append(unidad);
        sb.append(", ").append(super.toString());
        sb.append("} \n");
        return sb.toString();
    }
    
}
