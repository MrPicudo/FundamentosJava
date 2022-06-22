package p23_Laboratorio;

import java.util.Scanner;

public class PruebaCaja {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** VOLUMEN DE UNA CAJA *** \n");
        // Primero vamos a usar el constructor vacío para darle los valores de los atributos desde consola.
        Caja alpha = new Caja();
        System.out.print("Ingrese la altura de la caja:  ");
        alpha.alto = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese el ancho de la caja:  ");
        alpha.ancho = Double.parseDouble(scan.nextLine());
        System.out.print("Ingrese la profundidad de la caja:  ");
        alpha.profundo = Double.parseDouble(scan.nextLine());
        alpha.volumen();
        // Ahora vamos a usar el constructor con parámetros.
        Caja eco = new Caja(3, 2, 6);
        eco.volumen();
    }
}
