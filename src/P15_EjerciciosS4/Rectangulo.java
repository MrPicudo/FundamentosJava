package P15_EjerciciosS4;
import java.util.Scanner;

public class Rectangulo {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int alto, ancho, area, perimetro;
        System.out.print("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        area = alto*ancho;
        perimetro = 2*(alto + ancho);
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
