package p35_matricesdom;

public class Alumno {
    
    /* ATRIBUTOS */
    protected String nombre;
    protected int cuenta;
    protected double promedio;
    
    /* COSTRUCTORES */
    public Alumno() {}
    
    public Alumno(String nombre, int cuenta, double promedio) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.promedio = promedio;
    }
    
    /* MÉTODOS */
    
    // Get y set del atributo nombre.
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    // Get y set del atributo cuenta.
    public int getCuenta() {
        return this.cuenta;
    }
    
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
    
    // Get y set del atributo promedio.
    public double getPromedio() {
        return this.promedio;
    }
    
    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    
    // Método toString de la clase Alumno.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno[");
        sb.append("nombre: ").append(nombre);
        sb.append(", cuenta: ").append(cuenta);
        sb.append(", promedio: ").append(promedio);
        sb.append(", memoria: ").append(super.toString());
        sb.append(']');
        return sb.toString();
    }
    
}
