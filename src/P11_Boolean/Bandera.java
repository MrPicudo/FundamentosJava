package P11_Boolean;
import java.util.Scanner;

public class Bandera {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Las variables de tipo boolean (o bandera), solamente pueden almacenar dos valores posibles.
        boolean bandera1 = true; // Las palabras reservadas true y false van con minúsculas.
        System.out.println("Bandera 1 = " + bandera1);
        var bandera2 = false;
        System.out.println("Bandera 2 = " + bandera2);
        // Cuando usamos una variable tipo boolean dentro de un if, es como si preguntáramos si esa variable es true.
        if(bandera1) // Equivale a: if(badera1 == true), pero no es necesario poner ese código completo.
            System.out.println("¡La bandera 1 está activada!");
        else
            System.out.println("La bandera 1 no está activada");
        if(bandera2)
            System.out.println("¡La bandera 2 está activada!");
        else
            System.out.println("La bandera 2 no está activada");
        // La inferencia del tipo boolean con var se da cuando al identificador lo igualamos a una operación que regresa un boolean.
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = scan.nextInt();
        var bandera3 = edad>=18; // bandera3 va a ser de tipo boolean debido a que la operación regresa un tipo boolean.
        if(bandera3)
            System.out.println("Puede tramitar su INE");
        else
            System.out.println("No puede tramitar su INE");
    }
}
