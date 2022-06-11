package P10_Char;
import java.util.Scanner;

public class Unicode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Podemos asignarle cualquier caracter de UNICODE a una variable de tipo char
        char scorpio = '\u264F'; // En forma de UNICODE
        System.out.println("Scorpio = " + scorpio);
        var aries = (char) 9800; // En forma de decimal
        System.out.println("Aries = " + aries);
        char capricornio = 9809; // En forma de decimal (no es necesario el cast porque ya es una variable de tipo char)
        System.out.println("Capricornio = " + capricornio);
        // También podemos conocer la forma decimal de cualquier caracter si lo guardamos como un entero.
        int a = 'á', e = 'é', i = 'í', o = 'ó', u = 'ú';
        System.out.println("\n Letra \t Decimal");
        System.out.println("   á \t   " + a);
        System.out.println("   é \t   " + e);
        System.out.println("   í \t   " + i);
        System.out.println("   ó \t   " + o);
        System.out.println("   ú \t   " + u);
    }
}
