package P02_Variables;
// Importamos la clase Scanner.
import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // Creamos un objeto para usar la clase Scanner.
        Scanner scan = new Scanner(System.in);
        // Declaramos variables.
        int num = 28;
        double a;
        // Mostramos una variable declarada y definida.
        System.out.println(num);
        // Solicitamos un dato en consola y lo mostramos.
        System.out.print("Ingrese un número: ");
        // Para ingresar decimales con la clase Scanner debemos usar coma en vez de punto.
        a = scan.nextDouble();
        System.out.println("El número ingresado es " + a);
    }
}
