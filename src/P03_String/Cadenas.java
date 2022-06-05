package P03_String;

import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        System.out.println("¡Hola!, ¿cómo te llamas?: ");
        name = scan.nextLine();
        System.out.println("Mucho gusto " + name + ", bienvenido a Java.");
    }
}
