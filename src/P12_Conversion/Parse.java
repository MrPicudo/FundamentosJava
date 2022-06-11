package P12_Conversion;
import java.util.Scanner;

public class Parse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Para convertir de cadena a entero usamos el método Integer.parseInt
        String numero;
        System.out.print("Ingrese un número entero: ");
        numero = scan.nextLine();
        var num = Integer.parseInt(numero);
        System.out.println("La cadena numérica " + numero + " ya se puede usar como entero: " + 2*num);
        // Para convertir a números flotantes, debemos recordar que los flotantes son de tipo double (por default)
        System.out.print("\nIngrese un número con parte decimal: ");
        numero = scan.nextLine();
        var dec = Double.parseDouble(numero);
        System.out.println("La cadena numérica " + numero + " ya es un número flotante: " + 10*dec);
        // Existen otras conversiones que podemos realizar, como de tipo numérico a cadena.
        String a, b;
        a = Integer.toString(num);
        b = Double.toString(dec);
        System.out.println("\nLos números " + num + " y " + dec + " ya fueron convertidos a cadenas: " + (a+b));
        // También podemos usar un método de la clase String para convertir de números a cadenas.
        a = String.valueOf(dec);
        b = String.valueOf(num);
        System.out.println("\nLos números " + num + " y " + dec + " ya fueron convertidos a cadenas: " + (a+b));
        // Algo que podemos necesitar cuando recibimos datos de cadenas es separar esa cadena en caracteres.
        String fecha;
        char d1, d2, m1, m2, a1, a2, a3, a4;
        System.out.print("\nIngrese una fecha en el formato dd/mm/aaaa: ");
        fecha = scan.nextLine();
        // Recibimos los caracteres directamente de la cadena.
        d1 = fecha.charAt(0); d2 = fecha.charAt(1);
        m1 = fecha.charAt(3); m2 = fecha.charAt(4);
        a1 = fecha.charAt(6); a2 = fecha.charAt(7); a3 = fecha.charAt(8); a4 = fecha.charAt(9);
        System.out.println("El día es: " + d1+d2 + ", el mes es: " + m1+m2 + ", y el año: " + a1+a2+a3+a4);
        /* Cuando pedimos un número al usuario lo debemos recibir como texto y convertirlo con un try-catch a número.
           Pero eso es un tema que veremos más adelante. */
    }
}