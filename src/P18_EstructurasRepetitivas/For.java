package P18_EstructurasRepetitivas;

import java.util.Scanner;

public class For {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i, j, k;
        // Vamos a realizar triángulos con ciclos for anidados.
        /*  Triángulo 1:
            *
            * *
            * * *
            * * * *
            * * * * *   */
        System.out.println("Triángulo 1:");
        for(i=1; i<=5; i++) {
            for(j=1; j<=i; j++)
                System.out.print(" * ");
            System.out.print("\n");
        }
        /*  Triángulo 2:
            * * * * *
            * * * *
            * * *
            * *
            *           */
        System.out.println("\nTriángulo 2:");
        for(i=1; i<=5; i++) {
            for(j=1; j<=6-i; j++)
                System.out.print(" * ");
            System.out.print("\n");
        }
        /*  Triángulo 3:
            * * * * *
              * * * *
                * * *
                  * *
                    *   */
        System.out.println("\nTriángulo 3:");
        for(i=1; i<=5; i++) {
            for(j=1; j<i; j++)
                System.out.print("   ");
            for(k=1; k<=6-i; k++)
                System.out.print(" * ");
            System.out.print("\n");
        }
        /*  Triángulo 4:
                    *
                  * *
                * * *
              * * * *
            * * * * *   */
        System.out.println("\nTriángulo 4:");
        for(i=1; i<=5; i++) {
            for(j=1; j<=5-i; j++)
                System.out.print("   ");
            for(k=1; k<=i; k++)
                System.out.print(" * ");
            System.out.print("\n");
        }
    }

}
