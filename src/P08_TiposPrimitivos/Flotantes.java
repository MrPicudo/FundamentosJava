package P08_TiposPrimitivos;
import java.util.Scanner;

public class Flotantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Tabla de tipos primitivos flotantes.
        System.out.println("TABLA DE TIPOS PRIMITIVOS FLOTANTES. \n");
        System.out.println("Tipo primitivo \t Valor mínimo \t\t Valor máximo \t\t Tamaño en bytes \n");
        System.out.println("Float \t\t  " + Float.MIN_VALUE + "\t\t  " + Float.MAX_VALUE + "\t\t  " + Float.BYTES);
        System.out.println("Double \t\t  " + Double.MIN_VALUE + "\t\t  " + Double.MAX_VALUE + "\t  " + Double.BYTES);
        // Primero asignamos un número flotante a una variable de tipo float.
        float dec = 3.141592F; // Las literales flotantes por default son de tipo double, por eso la F.
        System.out.println("\n\nNúmero flotante = " + dec);
        // Para ingresar un número flotante desde consola, debemos usar coma en vez de punto.
        System.out.print("Ingrese un número con punto decimal: ");
        dec = scan.nextFloat();
        System.out.println("El número ingresado es: " + dec);
    }
}
