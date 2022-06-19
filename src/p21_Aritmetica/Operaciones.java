package p21_Aritmetica;

public class Operaciones {
    /* ATRIBUTOS */
    double num1, num2;
    
    /* MÉTODOS */
    
    // Método público sin retorno ni argumentos.
    public void sumar() {
        var suma = num1 + num2;
        System.out.println("   La suma de " + num1 + " + " + num2 + " es: " + suma);
    }
    
    // Método público con retorno, sin argumentos.
    public double restar() {
        /* Esta es una manera de hacer la resta y retornar el resultado:
        var resta = num1 - num2;
        return resta; */
        return this.num1 - this.num2; 
        /* Así identificamos que estamos trabajando con los atributos del objeto que mandó a llamar al método y no
           con argumentos ni variables del método (de hecho este método no tiene argumentos ni variables locales) */
    }
    
    // Método sin retorno, con argumentos.
    public void sumar2(double num1, double num2) {
        // Modificamos el valor de los atributos del objeto actual (el que mandó a llamar al método)
        this.num1 = num1; // El argumento num1 se asigna al atributo this.num1
        this.num2 = num2; // El argumento num2 se asigna al atributo this.num2
        // Y una vez actualizados, podemos llamar al método que hace la suma, desde este método nuevo.
        this.sumar();
    }
    
}
