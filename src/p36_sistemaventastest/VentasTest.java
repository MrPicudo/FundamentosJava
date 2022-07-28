package p36_sistemaventastest;

import p36_sistemaventasdom.*;

public class VentasTest {
    
    public static void main(String[] args) {
        // Creamos dos productos directamente con el constructor de dos argumentos.
        Producto producto1 = new Producto("Lapicero", 127.0);
        Producto producto2 = new Producto("Cuaderno", 250.0);
        // Agregamos estos productos a la orden 1 con los métodos vistos en el curso.
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.mostrarOrden();
        
        // Ahora creamos de manera personal, un arreglo de productos con la sintaxis resumida
        Producto productos[] = {new Producto("Puntillas", 67.0), new Producto("Goma Pentel", 50.0), new Producto("Pluma Pentel", 80.0)};
        // Y agregamos este arreglo a la orden 2, usando el constructor que tiene 1 argumento, el cual definimos personalmente.
        Orden orden2 = new Orden(productos);
        // Verificamos que todo se imprima correctamente.
        orden2.mostrarOrden();
    }
    
}
