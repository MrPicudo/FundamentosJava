package p34_arreglostest;

import p34_arreglosdom.Persona;

public class TestPersona {
    
    public static void main(String[] args) {
        // Vamos a crear un arreglo de objetos de la clase persona.
        Persona personas[] = new Persona[3];
        // Inicializamos las variables que se crearon en este arreglo.
        personas[0] = new Persona("Miguel Torres", 28, 'M');
        personas[1] = new Persona("Alejandro Torres", 33, 'M');
        personas[2] = new Persona("Josefina Chávez Nava", 52, 'F');
        // Mostramos los datos de las personas en el arreglo.
        for(int i=0; i<personas.length; i++) {
            System.out.println("Datos de la persona " + (i+1) + ":");
            System.out.println("  Nombre: " + personas[i].getNombre());
            System.out.println("  Edad: " + personas[i].getEdad());
            System.out.println("  Género: " + personas[i].getGenero() + "\n");
        }
        // También podemos usar el método toString para mostrar todos los datos de las personas.
        for(int i=0; i<personas.length; i++) {
            System.out.println("Datos de la persona " + (i+1) + ": " + personas[i]);
        }
        // Vamos a crear un arreglo de tipo Object usando la sintaxis resumida.
        Persona grupo[] = {new Persona("Nelly", 22, 'F'), new Persona("Elias", 21, 'M'), new Persona("Lalo", 21, 'M')};
        // Imprimimos ese arreglo.
        for(int i=0; i<grupo.length; i++) {
            System.out.println("Datos del integrante " + (i+1) + ": " + grupo[i]);
        }
    }
    
}
