package P13_Operadores;
import java.util.Scanner;

public class Unarios {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Los operadores unarios pueden cambiar el signo o el valor de verdad de una variable.
        var a = 10;
        var b = -a; // Operador unario de cambio de signo.
        System.out.println("Valor de a: " + a + ". Valor de b: " + b + ".");
        var res1 = true;
        var res2 = !res1; // Operador unario de negación.
        System.out.println("Variable 1 = " + res1 + ". Variable 2 = " + res2 + ".");
        // Operador unario de preincremento.
        var c = 17;
        System.out.print("Valor de c al inicializarlo: " + c + ". ");
        var d = ++c;
        System.out.println("Valor de d: " + d + ". Valor de c después de usar el ++c: " + c + ".");
        // Operador unario de postincremento.
        var e = 21;
        System.out.print("Valor de e al inicializarlo: " + e + ". ");
        var f = e++;
        System.out.println("Valor de f: " + f + ". Valor de e después de usar el e++: " + e + ".");
        /* También se pueden usar decrementos de la misma manera que los incrementos */
    }
}
