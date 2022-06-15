package P13_Operadores;
import java.util.Scanner;

public class Relacionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Primero vamos a pedir dos números para usar los operadores relacionales y de igualdad.
        int a, b;
        System.out.print("Ingrese dos números enteros. \n Primer número: ");
        a = Integer.parseInt(scan.nextLine());
        System.out.print(" Segundo número: ");
        b = Integer.parseInt(scan.nextLine());
        // Los operadores relacionales  y de igualdad son <, <=, ==, !=, >=, >
        var r1 = a < b;
        var r2 = a <= b;
        var r3 = a == b;
        var r4 = a != b;
        var r5 = a >= b;
        var r6 = a > b;
        // Imprimimos los resultados booleanos que dan los operadores relacionales:
        System.out.println("\nEl número " + a + " es menor que el número " + b + ": " + r1);
        System.out.println("El número " + a + " es menor o igual que el número " + b + ": " + r2);
        System.out.println("El número " + a + " es igual que el número " + b + ": " + r3);
        System.out.println("El número " + a + " es diferente al número " + b + ": " + r4);
        System.out.println("El número " + a + " es mayor o igual que el número " + b + ": " + r5);
        System.out.println("El número " + a + " es mayor que el número " + b + ": " + r6 + "\n");
        // Ahora vamos a comparar dos cadenas.
        String cad1, cad2;
        System.out.print("Ingrese dos frases. \n Primer frase: ");
        cad1 = scan.nextLine();
        System.out.print(" Segunda frase: ");
        cad2 = scan.nextLine();
        // Recordemos que una variable tipo cadena es un objeto de la clase String con métodos asociados.
        var comp = cad1.equals(cad2);
        System.out.print("Las cadenas \"" + cad1 + "\" y \"" + cad2 + "\" son ");
        if(comp)
            System.out.println("iguales.");
        else
            System.out.println("diferentes.");
    }
}