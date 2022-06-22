package p23_Laboratorio;

public class Caja {
    
    /* ATRIBUTOS */
    double ancho, alto, profundo;
    
    /* CONSTRUCTORES */
    public Caja() {
        // Constructor vacío.
    }
    
    public Caja(double ancho, double alto, double profundo) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundo = profundo;
    }
    
    /* MÉTODOS */
    /* IMPORTANTE: Todos los métodos en Java deben empezar con minúsculas, eso es de Java */
    public void volumen() {
        var volumen = this.alto*this.ancho*this.profundo;
        System.out.println("\n El volumen de la caja es: " + volumen);
    }
    
}
