/* Este programa se creó para visualizar el alcance de las variables y atributos desde el modo DEBUG */

package p22_Alcance;

import java.util.Scanner;

public class VariablesLocales {
    
    /* Creamos el objeto scan para poder pedir valores desde la consola */
    Scanner scan = new Scanner(System.in);
    
    /* ATRIBUTOS --- modificados a tipo public para poder acceder a ellos al importar esta clase */
    public int entero;
    public double flotante;
    public boolean hecho;
    public String cadena;
    
    /* MÉTODOS */
    public void metodo1() {
        int a = 10, b = 20;
        System.out.println("Las varibles locales al método \"metodo1\" son: " + a + " y " + b);
        System.out.println("Los atributos de la clase que se pueden usar desde este método son: ");
        System.out.println(" entero = " + this.entero);
        System.out.println(" flotante = " + this.flotante);
        System.out.println(" hecho = " + this.hecho);
        System.out.println(" cadena = " + this.cadena);
    }
    
    public void metodo2(int c, int d) {
        System.out.println("Ahora tenemos argumentos en el método: ");
        System.out.println(" Argumento 1: c = " + c);
        System.out.println(" Argumento 2: d = " + d);
        System.out.println("Mandamos a llamar al método 1 desde el método 2: \n");
        metodo1();
    }
    
    public int metodo3() {
        System.out.println("Estamos ejecutando un método con retorno, sin argumentos.");
        System.out.print("Ingrese un número entero: ");
        int num = Integer.parseInt(scan.nextLine());
        System.out.println("Retornando el número ingresado... \n");
        return num;
    }
    
}
