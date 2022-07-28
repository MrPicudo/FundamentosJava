package p36_sistemaventasdom;

public class Producto {
    
    /* ATRIBUTOS */
    private final int idProducto; // Definimos el ID como final porque no se va a poder modificar (no tiene método set)
    private String nombre;
    private double precio;
    private static int contadorProductos;
    
    /* CONSTRUCTORES */
    
    // Constructor vacío, controla que se inicialice el id del producto.
    private Producto() {
        this.idProducto = ++Producto.contadorProductos;
    }
    
    // Contador con argumentos para inicializar el nombre y el precio de un producto.
    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }
    
    /* MÉTODOS */
    
    // Get del atributo privado idProducto, no necesitamos el método set porque es autoincrementable.
    public int getIdProducto() {
        return this.idProducto;
    }
    
    // Get y set del atributo privado nombre.
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Get y set del atributo privado precio.
    public double getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    // Método toString de la clase Producto.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("   Producto[");
        sb.append("idProducto: ").append(idProducto);
        sb.append(", nombre: ").append(nombre);
        sb.append(", precio: ").append(precio);
        sb.append(']');
        return sb.toString();
    }
    
}
