package p21_Aritmetica;
import java.util.Scanner;

public class PruebaOperaciones {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Creamos nuestro objeto de la clase Operaciones.
        Operaciones calculadora = new Operaciones();
        // Pedimos al usuario que ingrese valores para los atributos de la clase.
        System.out.print("Ingrese el primer número: ");
        calculadora.num1 = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese el segundo número: ");
        calculadora.num2 = Double.parseDouble(scan.nextLine());
        // Mostramos los resultados usando los métodos que defimos en nuestra clase.
        System.out.println("\nResultados. \n Objeto 1:");
        calculadora.sumar();
        var resta = calculadora.restar();
        System.out.println("   La resta de " + calculadora.num1 + " - " + calculadora.num2 + " es: " + resta);
        // Creamos un nuevo objeto para analizar el uso de la variable this.
        Operaciones black = new Operaciones();
        System.out.println("\n Objeto 2:");
        black.num1 = 21.13;
        black.num2 = 13.83;
        black.sumar();
        // Ahora usamos un método con argumentos para actualizar los valores de los atributos.
        System.out.println("   Ingrese los números que se mandaran como argumentos al método.");
        System.out.print("    Número 1: ");
        var a = Double.parseDouble(scan.nextLine());
        System.out.print("    Número 2: ");
        var b = Double.parseDouble(scan.nextLine());
        black.sumar2(a, b);
        // Finalmente analizamos el uso de constructores vacíos y con argumentos.
        Operaciones objeto1 = new Operaciones();
        objeto1.info(); // Creamos el objeto 1 con el constructor vacío.
        Operaciones objeto2 = new Operaciones(28, 32); // Usamos "datos duros" para el contructor.
        objeto2.info(); // Creamos el objeto 2 con el constructor que inicializa los atributos.
    }
}
