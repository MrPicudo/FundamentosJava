package P07_Scanner;
// Dentro del paquete java.util se va a importar la clase Scanner para poder crear nuestro objeto scan.
import java.util.Scanner;

public class Objeto {
    public static void main(String[] args) {
        // Creación del objeto scan de la clase Scanner
        Scanner scan = new Scanner(System.in);
        // Uso de Scanner para leer texto.
        System.out.print("¡Hola!, ¿cómo te llamas?: ");
        String name = scan.nextLine();
        // Uso de Scanner para leer enteros.
        System.out.print("¿Qué edad tienes?: ");
        int age = scan.nextInt();
        // Uso de Scanner para leer flotantes.
        System.out.print("¿Cuál es tu sueldo mensual deseado?: ");
        float salary = scan.nextFloat();
        // Uso de Scanner para leer booleanos (true, false)
        System.out.print("¿Te interesa trabajar en nuestra empresa?: ");
        // Cuando pedimos un valor boolean tenemos que escribir literalmente "true" o "false".
        boolean answer = scan.nextBoolean();
        // Impresión de resultados.
        System.out.print("\n Mucho gusto " + name + ". Tienes " + age + " años y tu sueldo mensual deseado de ");
        String answer2, goodbye;
        if(answer) {
            answer2 = "si";
            goodbye = "¡Bienvenido!";
        }
        else {
            answer2 = "no";
            goodbye = "Que te vaya bien.";
        }
        System.out.println("$" + salary + " es razonable. Marcaste que " + answer2 + " te interesa trabajar con nosotros.");
        System.out.println(goodbye);
    }
}