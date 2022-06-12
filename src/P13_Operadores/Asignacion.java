package P13_Operadores;
import java.util.Scanner;

public class Asignacion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        float j;
        /* Vamos a imprimir las siguientes series numéricas con for y operadores de composición. */
        // Serie 1: 7 12 17 22 27 32 27 42 47 52 57 62 67 72 77
        System.out.println("Serie 1:");
        for(i=7; i<=77; i+=5) // Si declaramos una variable dentro de un for, no la podemos usar después en otro for.
            System.out.print(i + "\t");
        // Serie 2: 99 88 77 66 55 44 33 22 11 0 -11 -22 -33 -44 -55
        System.out.println("\n\nSerie 2:");
        for(i=99; i>=-55; i-=11)
            System.out.print(i + "\t");
        // Serie 3: 3 6 12 24 48 96 192 384 768 1536 3072 6144 12288 24576 49152
        System.out.println("\n\nSerie 3:");
        for(i=3; i<=49152; i*=2) // Deja que la computadora haga los cálculos...
            System.out.print(i + "\t");
        // Serie 4: 504210 72030 10290 1470 210 30 4.285714 0.6122449 0.08746356 0.012494794 0.0017849706
        System.out.println("\n\nSerie 4:");
        for(j=504210; j>0.001; j/=7)
            System.out.print(j + "   ");
        /* El operador de composición %= nos manda directamente cualquier número a su residuo que se queda
           ahí mismo si lo volvemos a llamar de nuevo, por ejemplo: */
        System.out.println("\n\nSerie 5:");
        for(i=45251, j=1; j<=15; i%=7, j++)
            System.out.print(i + "\t");
    }
}