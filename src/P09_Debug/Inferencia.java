package P09_Debug;
import java.util.Scanner;

public class Inferencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Vamos a usar line breakpoints para el modo debug de nuestro código.
        var entero = 2117;
        var enteroLong = 1000000L;
        var car1 = 'a'; // Mandamos directamente el caracter que queremos.
        var car2 = '\u0061'; // O lo mandamos en código UNICODE.
        var car3 = (char) 97; // O con su forma decimal haciendo un cast explícito.
        var cadena = "Programa";
        var flotanteFloat = 3.1416F;
        var flotanteDouble = 3.141592;
        /* IMPORTANTE: Como ejercicio de práctica, debo usar el modo debug en cada programa del curso
           de ahora en adelante. */
        System.out.println(entero + enteroLong + car1 + car2 + car3 + cadena + flotanteFloat + flotanteDouble);
    }
}
