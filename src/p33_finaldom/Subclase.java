package p33_finaldom;

public class Subclase extends Palabra { // extends Palabra (no es posible cuando la clase Palabra es final.
    
    public static void saludo() {
        System.out.println("Hola Mundo desde Java");
    }
    
    /* Este método marca error porque no puede sobreescribirse un método final de la clase padre.
    public static final void mensaje() {
        System.out.println("Este método no puede sobreescribirse porque es final.");
    } */
    
}
