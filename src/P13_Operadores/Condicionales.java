package P13_Operadores;
import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Vamos a definir un intervalo y comprobar si un número se encuentra dentro de ese intervalo.
        double min, max, num;
        System.out.print("Ingrese los valores extremos de un intervalo numérico. \n Valor mínimo: ");
        min = Double.parseDouble(scan.nextLine());
        // Pedimos el número mayor y comprobamos que realmente sea mayor que el extremo izquierdo del intervalo.
        do {
            System.out.print(" Valor máximo: ");
            max = Double.parseDouble(scan.nextLine());
            if(max<=min)
                System.out.println("Debe ingresar un número mayor que " + min);
        } while(max<=min);
        System.out.print("Ingrese un número para verificar si se encuentra en el intervalo: ");
        num = Double.parseDouble(scan.nextLine());
        // Verificamos que el número ingresado se encuentre dentro del intervalo con el operador && (AND)
        if(num>=min && num<=max)
            System.out.println("El número " + num + " si se encuentra en el intervalo. \n");
        else
            System.out.println("El número " + num + " no se encuentra en el intervalo. \n");
        // Ahora vamos a definir un intervalo por trozos, y verificar si un número se encuentra en el.
        System.out.println("Ingrese los valores de un intervalo del tipo (-inf, a) U (b, +inf).");
        System.out.print(" Valor de a: ");
        min = Double.parseDouble(scan.nextLine());
        do {
            System.out.print(" Valor de b: ");
            max = Double.parseDouble(scan.nextLine());
            if(max<=min)
                System.out.println("Debe ingresar un número mayor que " + min);
        } while(max<=min);
        System.out.print("Ingrese un número para verificar si se encuentra en el intervalo: ");
        num = Double.parseDouble(scan.nextLine());
        // Verificamos que el número ingresado se encuentre dentro del intervalo con el operador || (OR)
        if(num<=min || num>=max)
            System.out.println("El número " + num + " si se encuentra en el intervalo. \n");
        else
            System.out.println("El número " + num + " no se encuentra en el intervalo. \n");
        // Finalmente vamos a usar el operador NOT para verificar el mismo número del intervalo anterior.
        System.out.println("Solución usando un método alternativo: ");
        if(!(num>=min && num<=max))
            System.out.println("El número " + num + " si se encuentra en el intervalo. \n");
        else
            System.out.println("El número " + num + " no se encuentra en el intervalo. \n");
    }
}