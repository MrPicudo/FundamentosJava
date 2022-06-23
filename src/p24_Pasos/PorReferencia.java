package p24_Pasos;

// Importamos la clase persona con la sintaxis: import nombrePaquete.nombreClase;
import p20_Clases.Persona;
// Lo único importante es que el paquete donde se encuentra la clase esté en el mismo proyecto.

public class PorReferencia {
    
    public static void main(String[] args) {
        // Ya podemos crear objetos de la clase persona que está en otro paquete.
        Persona objeto1 = new Persona();
        objeto1.nombre = "Miguel Torres";
        cambio(objeto1); // La variable "objeto1" almacena una referencia al objeto creado.
        System.out.println("Nombre devuelto: " + objeto1.nombre);
    }
    
    // El paso por referencia utiliza variables de tipo object.
    public static void cambio(Persona objeto) {
        System.out.println("Nombre recibido: " + objeto.nombre);
        objeto.nombre = "Alejandro Torres";
    }
}
