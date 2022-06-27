package p29_HerenciaDom;

public class Empleado extends Persona {
    
    /* ATRIBUTOS */
    private int idEmpleado;
    private double sueldo;
    private static int contadorEmpleado;
    
    /* CONSTRUCTORES */
    
    // Constructor para inicializar el único atributo privado de la clase Empleado que es modificable manualmente
    public Empleado(double sueldo) {
        this.sueldo = sueldo;
        Empleado.contadorEmpleado++;
        this.idEmpleado = Empleado.contadorEmpleado;
    }
    
    // Constructor para inicializar todos los atributos que debe de tener un objeto de la clase Empleado
    public Empleado(String nombre, double sueldo, String direccion) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.direccion = direccion;
        Empleado.contadorEmpleado++;
        this.idEmpleado = Empleado.contadorEmpleado;
    }
    
    // Constructor ideal para los objetos de la subclase Empleado, usando todos los elementos de programación necesarios
    public Empleado(double sueldo, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.sueldo = sueldo;
        this.idEmpleado = ++Empleado.contadorEmpleado;
    }
    
    /* MÉTODOS */
    
    // Como el atributo idEmpleado se genera automáticamente, solamente tiene el método get.
    public int getIdEmpleado() {
        return this.idEmpleado;
    }
    
    // Get y set del atributo privado sueldo
    public double getSueldo() {
        return this.sueldo;
    }
    
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // Get y set del atributo privado (y estático) contadorEmpleado
    public int getContadorEmpleado() {
        return Empleado.contadorEmpleado;
    }
    
    public void setContadorEmpleado(int contadorEmpleado) {
        Empleado.contadorEmpleado = contadorEmpleado;
    }
    
    // Método toString para los objetos de la clase Emplado
//    @Override
//    public String toString() {
//        return "Empleado[nombre: " + this.nombre + 
//                ", idEmpleado: " + this.idEmpleado + 
//                ", sueldo: " + this.sueldo + 
//                ", direccion: " + this.direccion + "] \n";
//    }
    
    // Método toString ideal para los objetos de la clase Empleado
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("idEmpleado: ").append(this.idEmpleado);
        sb.append(", sueldo: ").append(this.sueldo);
        sb.append(", ").append(super.toString());
        sb.append("} \n");
        return sb.toString();
    }
    
}
