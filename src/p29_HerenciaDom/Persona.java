// En este programa utilizamos el concepto de herencia, siguiendo un diagrama de clases.

package p29_HerenciaDom;

public class Persona {
    
    /* ATRIBUTOS */
    public String nombre;
    private char genero;
    private int edad;
    protected String direccion;
    
    /* CONSTRUCTORES */
    
    public Persona() {
        // Constructor vacío
    }
    
    // Constructor para inicializar los atributos heredables
    public Persona(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }
    
    // Constructor para inicializar todos los atributos de tipo persona
    public Persona(String nombre, char genero, int edad, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }
    
    /* MÉTODOS */
    
    // Get y set del atributo público nombre
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Get y set del atributo privado genero
    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    // Get y set del atributo privado edad
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Get y set del atributo protegido direccion
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    // Método toString sobreescrito de la clase padre Object, para los objetos de la clase Persona
//    @Override
//    public String toString() {
//        return "Persona[nombre: " + this.nombre +  
//                ", genero: " + this.genero + 
//                ", edad: " + this.edad + 
//                ", direccion: " + this.direccion + "]";
//    }
    
    // Método ideal para la función toString para los objetos de la clase Persona
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona[");
        sb.append("nombre: ").append(this.nombre);
        sb.append(", genero: ").append(this.genero);
        sb.append(", edad: ").append(this.edad);
        sb.append(", direccion: ").append(this.direccion);
        sb.append(", memoria: ").append(super.toString());
        sb.append(']');
        return sb.toString();
    }
    
    
}
