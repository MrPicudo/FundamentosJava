package P13_Operadores;
import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad;
        System.out.print("Ingresa tu edad: ");
        edad = Integer.parseInt(scan.nextLine());
        // Operador ternario.
        var ter = (edad>=18) ? "Si puedes tramitar tu INE." : "No puedes tramitar tu INE." ;
        System.out.println(ter);
        /* El operador ternario necesita una variable a la cual se le asigna el resultado, podemos verlo como 
           un operador booleano pero al que se le pueden asignar valores de cualquier tipo, como String, int, etc. */
    }
}