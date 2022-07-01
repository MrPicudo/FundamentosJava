package p32_mx.com.mathreviews.dom;

public class Utileria {
    // Este método si se puede mandar a llamar desde main.
    public static void imprimir(String cadena) {
        System.out.println("Cadena: " + cadena);
    }
    
    // Este método no se puede mandar a llamar desde main porque no es estático.
    public void saludar() {
        System.out.println("¡Hola mundo!");
    }
    
    public static void password() {
        System.out.println("Tu contraseña es: *******");
    }
}
