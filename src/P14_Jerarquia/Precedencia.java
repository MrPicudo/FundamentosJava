package P14_Jerarquia;
import java.util.Scanner;

public class Precedencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // La mayor jerarquía de operadores la tienen los operadores unarios.
        double a = 21, b = 93;
        var c = ++a + 5 - --b;
        System.out.println("Resultados: ");
        System.out.println("Variable a = " + a); // Queda un valor de 22.
        System.out.println("Variable b = " + b); // Queda un valor de 92.
        System.out.println("Variable c = " + c + "\n"); // Se obtiene un valor de -65.
        var d = 17 - a++ + b--;
        System.out.println("Resultados: ");
        System.out.println("Variable a = " + a); // Queda un valor de 23
        System.out.println("Variable b = " + b); // Queda un valor de 91
        System.out.println("Variable d = " + d + "\n"); // Se obtiene un valor de 87
        var e = --c + d++ -10 + a++ + --b;
        System.out.println("Resultados: ");
        System.out.println("Variable a = " + a); // Queda un valor de 24
        System.out.println("Variable b = " + b); // Queda un valor de 90
        System.out.println("Variable c = " + c); // Queda un valor de -66
        System.out.println("Variable d = " + d); // Queda un valor de 88
        System.out.println("Variable e = " + e + "\n"); // Se obtiene un valor de 124
        // La jerarquía de suma, resta, multiplicación y división es la normal.
        var f = a + b * c / d - e;
        System.out.println("Resultados: ");
        System.out.println("Variable f = " + f + "\n"); // Se obtiene un valor de -167.5
        // Podemos agregar paréntesis y afecta la jerarquía de la manera que ya sabemos.
        f = a + b * c / (d - e);
        System.out.println("Resultados: ");
        System.out.println("Variable f = " + f); // Se obtiene un valor de 189
    }
}
