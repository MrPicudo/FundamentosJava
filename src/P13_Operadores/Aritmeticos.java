package P13_Operadores;
import java.util.Scanner;

public class Aritmeticos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        // Primero pedimos los dos números enteros.
        System.out.println("Ingrese dos números: ");
        a = Integer.parseInt(scan.nextLine());
        b = Integer.parseInt(scan.nextLine());
        // Vamos a definir variables con ellos.
        var div1 = a/b; // Dos variables ya definidas dan un resultado de acuerdo a su tipo de dato.
        var div2 = 5.0/b; // Las literales con decimales son de tipo double por default.
        var div3 = 17.0F/a; // Si agregamos una F, la literal se vuelve de tipo float.
        var div4 = a/3.0D; // No importa si la variable con mayor jerarquía es el numerador o el denominador.
        var div5 = 5.0F/3.0D; // Lo importante es quién tiene más jerarquía.
        // Ahora vamos a usar el operador módulo entero.
        for(int i=43; i<=49; i++)
            System.out.println("El residuo entero de dividir " + i + " entre 7 es: " + i%7);
    }
}