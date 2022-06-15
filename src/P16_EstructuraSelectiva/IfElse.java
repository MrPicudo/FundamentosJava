/* Este código es EXCELENTE para usar el modo debug y ver cómo funciona el programa */
package P16_EstructuraSelectiva;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Ventas de 0 a 4,999.90 sin comisión. D
           Ventas de 5000.00 a 14,999.90 comisión del 5%
           Ventas de 15,000.00 a 29,999.90 comisión del 7%
           Ventas de 30,000.00 en adelante comisión del 10% */
        double ventas, com;
        for (int i=1; i<=2; i++) {
            do {
                System.out.print("Ingrese el monto de las ventas realizadas por el vendedor: ");
                ventas = Double.parseDouble(scan.nextLine());
                if (ventas < 0) {
                    System.out.println("Error, el monto no puede ser negativo.");
                }
            } while (ventas < 0);
            // Agregamos variables booleanas solo para mostrar como puede funcionar un if.
            var c1 = ventas < 5000;
            var c2 = ventas >= 5000 && ventas < 15000;
            var c3 = ventas >= 15000 && ventas < 30000;
            System.out.print("   La comisión por ventas de $" + ventas + " es del ");
            if (i == 1) {
                // Comenzamos la estructura if anidada.
                if (c1) {
                    com = 0.0;
                } else {
                    if (c2) {
                        com = 0.05;
                    } else {
                        if (c3) {
                            com = 0.07;
                        } else {
                            com = 0.10;
                        }
                    }
                }
            }
            else {
                // Vamos a hacer la misma estructura anidada usando else if.
                if(c1) {
                    com = 0.0;
                } else if(c2) { // Cada else if está relacionado con el if anterior.
                   com = 0.05;
                } else if(c3) { // O con los if's anteriores a él.
                    com = 0.07;
                } else { // Hasta llegar a la condición final, por eliminación de opciones.
                    com = 0.10; 
                } // Si verifica la condición en cualquiera de los pasos, omite lo demás, haciendo eficiente el código.
            }
            System.out.println(100 * com + "%");
            System.out.println("   El pago de este mes por comisiones es de: $" + ventas * com + "\n");
        }
    }
}
