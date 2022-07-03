package p34_arreglosdom;

public class Persona {
    
    /* ATRIBUTOS */
    protected String nombre;
    protected int edad;
    protected char genero;
    
    /* COSTRUCTORES */
    
    // Constructor vacío.
    public Persona() {}
    
    // Constructor que inicializa todos los atributos.
    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    
    /*  MÉTODOS */
    
    // Get y set del atributo nombre.
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Get y set del atributo edad.
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // Get y set del atributo genero.
    public char getGenero() {
        return this.genero;
    }
    
    public void setGenero(char genero) {
        this.genero = genero;
    }
    
    // Método toString del arreglo.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Arreglos[");
        sb.append("nombre: ").append(nombre);
        sb.append(", edad: ").append(edad);
        sb.append(", genero: ").append(genero);
        sb.append(", memoria: ").append(super.toString());
        sb.append(']');
        return sb.toString();
    }
    
}
