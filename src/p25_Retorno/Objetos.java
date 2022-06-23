package p25_Retorno;

import p22_Alcance.VariablesLocales;

public class Objetos {

    public static void main(String[] args) {
        // Primero creamos un objeto de la clase importada.
        VariablesLocales objeto = new VariablesLocales();
        objeto.metodo1();
        // Vamos a imprimir la variable tipo Object para observar la dirección de memoria que tiene asociada.
        System.out.println("\nDirección de memoria inicial del objeto 1: " + objeto);
        // Ahora llamamos a un método que regresa la variable tipo object.
        objeto = retorno(13, 3.1416, true, "Hola Mundo");
        objeto.metodo1();
        // Comparamos la dirección de memoria con la que tenía inicialmente.
        System.out.println("\nDirección de memoria final del objeto 1: " + objeto);
    }

    public static VariablesLocales retorno(int a, double b, boolean c, String d) {
        VariablesLocales objeto2 = new VariablesLocales();
        // Primero imprimimos la dirección de memoria del objeto 2 que acabamos de crear.
        System.out.println("\nDirección de memoria del objeto 2: " + objeto2 + "\n");
        if (objeto2 == null) {
            System.out.println("Error, la variable de tipo Object no apunta a ningún objeto.");
            return null; // Así podemos agregar diferentes return dependiendo de lo que ocurra en nuestro código.
        } else {
            // Asignamos todos los valores recibidos en los parámetros a los atributos de un objeto.
            objeto2.entero = a;
            objeto2.flotante = b;
            objeto2.hecho = c;
            objeto2.cadena = d;
            // Regresamos esa referencia de memoria al objeto para modificar la referencia de la variable que la reciba.
            return objeto2;
        }
    }

}
