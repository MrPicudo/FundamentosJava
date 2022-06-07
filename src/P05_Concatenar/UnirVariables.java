package P05_Concatenar;
import java.util.Scanner;

public class UnirVariables {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = "Miguel Torres";
        var major = "programador";
        System.out.println(name + " es " + major);
        // También podemos concatenar directamente en una variable.
        var mensaje = name + " es " + major;
        System.out.println("mensaje = " + mensaje);
        // Al concatenar números existe una jerarquía que puede o no, realizar la suma de los números.
        int num1 = 13, num2 = 21;
        System.out.println(num1 + num2 + " " + name);
        System.out.println(name + " " + num1 + num2);
        // En la siguiente línea se muestra más claramente lo que es el contexto cadena.
        System.out.println(num1 + num2 + " " + name + " " + num1 + num1);
        // Podemos modificar la jerarquía del contexto cadena usando paréntesis.
        System.out.println(num1 + num2 + " " + name + " " + (num1 + num1));
    }
}
