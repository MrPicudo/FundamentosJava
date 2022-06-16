package p20_Clases;

public class Persona {
    // Definimos los atributos de nuestra clase.
    String nombre;
    String genero;
    int edad;
    // Después de los atributos, definimos los métodos de nuestra clase.
    public void info() {
        System.out.println("Los atributos de este objeto son: ");
        System.out.println(" Nombre: " + nombre);
        System.out.println(" Género: " + genero);
        System.out.println(" Edad: " + edad + "\n");
    }
}
