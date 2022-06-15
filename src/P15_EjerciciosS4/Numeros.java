package P15_EjerciciosS4;
import java.util.Scanner;

public class Numeros {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        int numero1, numero2;
        System.out.print("Proporciona el numero1: ");
        numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el numero2: ");
        numero2 = Integer.parseInt(consola.nextLine());
        var mayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El numero mayor es: \n" + mayor);
    }
}
