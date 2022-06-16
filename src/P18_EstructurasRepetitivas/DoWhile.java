package P18_EstructurasRepetitivas;

import java.util.Scanner;

public class DoWhile {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double salario;
        int edad;
        // Vamos a usar el ciclo do while para validar una variable de tipo double.
        do {
            System.out.print("Ingresa tu salario mensual deseado: ");
            salario = Double.parseDouble(scan.nextLine());
            if(salario<0.0)
                System.out.println("No puedes recibier un salario negativo. Ingresa nuevamente. \n");
        } while(salario<0.0);
        System.out.println("Tu salario mensual deseado es de: " + salario + " dólares. \n");
        // Ahora vamos a validar una variable de tipo int.
        do {
            System.out.print("Ingresa tu edad: ");
            edad = Integer.parseInt(scan.nextLine());
            if(edad<0)
                System.out.println("Error, no existen edades negativas. Ingresa nuevamente. \n");
        } while(edad<0);
        System.out.println("Tienes " + edad + " años. \n");
    }
    
}
