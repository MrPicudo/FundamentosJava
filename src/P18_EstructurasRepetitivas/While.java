package P18_EstructurasRepetitivas;

import java.util.Scanner;

public class While {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean go = true;
        int con=0;
        String title;
        System.out.println("Escribe el título de los libros que has leído o escribe \"salir\" para terminar el programa. \n");
        while(go) {
            System.out.print(" Libro #" + (con+1) + ": ");
            title = scan.nextLine();
            if("salir".equals(title.toLowerCase())) // Podemos agregar un watch en la condición del if en modo debug.
                go = false;
            else
                con++;
        }
        System.out.println("\nHas leído " + con + " libros.");
    }
    
}
