package p26_This;

public class VariableThis {
    public static void main(String[] args) {
        Alumno jmtcn = new Alumno("Miguel Torres", 420093743, 8.63);
        jmtcn.info();
    }
}

// El acceso de esta clase será el que tienen por default, que es "package".
class Alumno {
    /* ATRIBUTOS */
    String nombre;
    int cuenta;
    double promedio;
    
    /* CONSTRUCTORES */
    Alumno() {
        // Constructor vacío.
    }
    
    Alumno(String nombre, int cuenta, double promedio) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.promedio = promedio;
    }
    
    /* Métodos */
    void info() {
        System.out.println("\nINFORMACIÓN DEL ALUMNO: ");
        System.out.println(" Dirección de memoria: " + this); // La variable this contiene una dirección de memoria.
        System.out.println(" Nombre: " + this.nombre);
        System.out.println(" Número de cuenta: " + this.cuenta);
        System.out.println(" Promedio: " + this.promedio);
        // Ahora mezclamos dos objetos para imprimir la variable this.
        new Materia().imprimir(this);
        /*  Lo anterior equivale a las siguientes dos lineas de código:
            Materia materia = new Materia();
            materia.imprimir(this); */
    }
}

class Materia {
    void imprimir(Alumno alumno) {
        System.out.println(" Dirección del objeto recibido: " + alumno);
        System.out.println(" Dirección del objeto actual: " + this);
    }
}