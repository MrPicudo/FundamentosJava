package p36_sistemaventasdom;

public class Orden {
    /* ATRIBUTOS */
    private final int idOrden; // Lo definimos como final porque no se le cambia el valor después de la primera vez.
    private Producto productos[];
    private static int contadorOrdenes;
    private int numeroProductos; // Nos va a servir para contar cuántos objetos de tipo Producto se agregaron al arreglo.
    public static int MAX_PRODUCTOS = 10; // Las constantes se declaran con mayúsculas.
    
    /* CONSTRUCTORES */
    
    // Constructor vacío, hace el conteo de la orden e inicializa el arreglo de productos.
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // Cambia la referencia de memoria de NULL a una memoria reservada para el arreglo.
    }
    
    // Constructor que recibe el arreglo completo de productos para una orden (creado personalmente)
    public Orden(Producto productos[]) {
        this();
        this.numeroProductos = productos.length; // Tenemos que "actualizar" el número de productos así, porque no se usó el método "agregarProducto".
        for(int i=0; i<this.numeroProductos; i++) {
            this.productos[i] = productos[i];
        }
        // System.arraycopy(productos, 0, this.productos, 0, this.numeroProductos); (Clase sugerida)
    }
    
    /* MÉTODOS */
    
    // Método para agregar producto al arreglo verificando que no excedamos el límite.
    public void agregarProducto(Producto producto) {
        // Primero tenemos que validar que no nos hemos pasado del número de productos permitidos en el arreglo.
        if(this.numeroProductos < Orden.MAX_PRODUCTOS)
            this.productos[this.numeroProductos++] = producto;
        else
            System.out.println("Se ha superado el número máximo de productos en la orden. \n");
    }
    
    // Método para calcular el pago total de la orden verificando que se tenga al menos un producto.
    public double calcularTotal() {
        double total = 0.0;
        // Este for únicamente se ejecuta si hay al menos un producto en el arreglo de productos.
        for(int i=0; i<this.numeroProductos; i++) {
            // Producto auxiliar = this.productos[i];
            // total += auxiliar.getPrecio();
            total += this.productos[i].getPrecio(); // Así obtenemos el mismo resultado de las dos líneas anteriores.
        }
        return total;
    }
    
    // Imprime el detalle de la orden junto con todos los productos que contiene.
    public void mostrarOrden() {
        System.out.println("ID de la orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("Total de la orden: $" + totalOrden);
        System.out.println("Productos de la orden: ");
        for(int i=0; i<this.numeroProductos; i++) {
            System.out.println(this.productos[i]);
        }
        System.out.print("\n");
    }
    
}
