package P19_GoingTo;

import java.util.Scanner;

public class Etiquetas {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* El uso de etiquetas NO es recomendable pero debemos de conocer cómo funcionan. */
        int i, j;
        // El uso de continue con etiqueta nos permite saltarnos uno o más ciclos internos en una estructura anidada.
        System.out.println("Uso de continue - etiqueta: ");
        externo: for(i=1; i<=5; i++) {
            System.out.print("\nRenglón " + i + ": \t");
            interno: for(j=1; j<=3; j++) {
                System.out.print("Columna " + j + "   ");
                if(i==2 || (i==4 && j==2))
                    continue externo;
            }
        }
        // El uso de break con etiqueta nos permite romper ciclos anidados.
        System.out.println("\n\nUso de break - etiqueta: ");
        externo: for(i=1; i<=5; i++) {
            System.out.print("\nRenglón " + i + ": \t");
            interno: for(j=1; j<=3; j++) {
                System.out.print("Columna " + j + "   ");
                if(i==3 && j==2)
                    break externo;
            }
        }
        System.out.println("\n\n *** Mr Picudo ***");
    }

}
