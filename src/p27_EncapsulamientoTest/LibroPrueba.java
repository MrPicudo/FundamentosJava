package p27_EncapsulamientoTest;

// Importamos el paquete que tiene nuestras clases fuente.
import p27_EncapsulamientoDom.Libro;
import java.util.Scanner;

public class LibroPrueba {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Libro libro1 = new Libro("Cálculo multivariable", 2022, 1260.00, true);
        Libro libro2 = new Libro();
        // Usamos los métodos de acceso para mostrar los valores de los atributos del objeto "libro1"
        System.out.println("Detalles del libro 1");
        System.out.println(" Título: " + libro1.getTitulo());
        System.out.println(" Año de publicación: " + libro1.getAño());
        System.out.println(" Precio: " + libro1.getPrecio());
        System.out.println(" Existencias: " + libro1.isExistencia());
        // Ahora modificamos los valores de dos de los atributos.
        System.out.print("\nIngrese el nuevo precio del libro 1:  ");
        libro1.setPrecio(Double.parseDouble(scan.nextLine()));
        System.out.print("¿Hay existencias del libro 1? (true/false):  ");
        libro1.setExistencia(Boolean.parseBoolean(scan.nextLine()));
        // Mostramos de nuevo los detalles del libro 1.
        System.out.println("\nDetalles del libro 1 (modificados)");
        System.out.println(" Título: " + libro1.getTitulo());
        System.out.println(" Año de publicación: " + libro1.getAño());
        System.out.println(" Precio: " + libro1.getPrecio());
        System.out.println(" Existencias: " + libro1.isExistencia());
        // Ahora vamos a definir los atributos del libro 2.
        System.out.println("\nIngrese los datos del libro 2");
        System.out.print(" Título:  ");
        libro2.setTitulo(scan.nextLine());
        System.out.print(" Año de publicación:  ");
        libro2.setAño(Integer.parseInt(scan.nextLine()));
        System.out.print(" Precio:  ");
        libro2.setPrecio(Double.parseDouble(scan.nextLine()));
        System.out.print(" Existencias (true/false):  ");
        libro2.setExistencia(Boolean.parseBoolean(scan.nextLine()));
        // Y vamos a mostrar estos detalles en consola usando un método.
        info(libro2);
        // Finalmente volvemos a imprimir los detalles del libro 1, pero con el método toString.
        System.out.println("\nLibro 1: " + libro1);
        // Esta es la manera más recomendable de mostrar los valores actuales de los atributos de un objeto.
    }
    
    public static void info(Libro libro) {
        System.out.println("\nDetalles del libro");
        System.out.println(" Título: " + libro.getTitulo());
        System.out.println(" Año de publicación: " + libro.getAño());
        System.out.println(" Precio: " + libro.getPrecio());
        System.out.println(" Existencias: " + libro.isExistencia());
    }
    
}
