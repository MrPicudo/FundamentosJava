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
    
    // Los getters y setters de la clase se pueden crear automáticamente y siempre son sencillos.
    
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
