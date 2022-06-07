package P06_Caracteres;
import java.util.Scanner;

public class Especiales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("TABLA DE CARACTERES ESPECIALES \n");
        System.out.println("Caracter especial \t Acción que realiza");
        System.out.println("   \\n \t\t\t Salto de línea");
        System.out.println("   \\t \t\t\t Tabulador (sangría)");
        System.out.println("   \\b \t\t\t Retroceso (un caracter a la vez)");
        System.out.println("   \" \t\t\t Comilla doble (solo se puede mostrar usando diagonal invertida)");
    }
}
