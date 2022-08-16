package p37_proyectofinaldom;

public class Orden {
    
    /* ATRIBUTOS */
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdendes;
    private int contadorComputadoras;
    private static final int MAXCOMPUTADORAS = 2;
    
    /* CONSTRUCTORES */
    public Orden() {
        this.idOrden = ++Orden.contadorOrdendes;
        this.computadoras = new Computadora[Orden.MAXCOMPUTADORAS];
    }
    
    public void agregarComputadora(Computadora computadora) {
        if(this.contadorComputadoras < Orden.MAXCOMPUTADORAS) {
            this.computadoras[this.contadorComputadoras++] = computadora;
        }
        else {
            System.out.println("Has superado el límite de computadoras para cada orden: (" + Orden.MAXCOMPUTADORAS + ")");
        }
    }
    
    public void mostrarOrden() {
        System.out.println("Orden #" + this.idOrden);
        System.out.println("Computadoras de la orden: ");
        for(int i=0; i<this.contadorComputadoras; i++) {
            System.out.println(this.computadoras[i]); // Esto funciona porque ya tenemos el método toString en la clase computadora.
        }
    }
}
