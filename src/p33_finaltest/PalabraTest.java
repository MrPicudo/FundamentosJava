package p33_finaltest;

import p33_finaldom.*;

public class PalabraTest {
    
    public static void main(String[] args) {
        // Uso de final con variables.
        final double pagoPorHora = 130; // No se podrá modificar su valor, pero todavía no es una constante.
        // Uso de un método sobreescrito de la clase padre.
        Palabra.saludo(); // Método original de la clase padre.
        Subclase.saludo(); // Método sobreescrito de la clase hija.
        // Uso de un método de tipo final de la clase padre, desde la clase hija.
        Subclase.mensaje();
        // Uso de una constante definida en la clase Palabra.
        System.out.println("Valor de pi: " + Palabra.PI);
        // Creamos un objeto de la clase Palabra.
        Palabra palabra1 = new Palabra();
        System.out.println("palabra1 = " + palabra1);
        // Cambiamos la referencia de memoria de la variable palabra1:
        palabra1 = new Palabra();
        System.out.println("palabra1 = " + palabra1);
        // Si creamos una variable tipo Object con final, no se podrá sobreescribir la referencia de memoria.
        final Palabra palabra2 = new Palabra();
        System.out.println("palabra2 = " + palabra2);
        /* La siguiente linea arroja un error por que la variable a la que queremos cambiarle la referencia es final
        palabra2 = new Palabra(); */
        /* Sin embargo, si podemos cambiar los valores de los atributos del objeto referenciado por
            una variable tipo final (tiene lógica, pues los atributos del objeto nunca fueron declarados como final) */
        palabra2.setPalabra("Manzana");
        palabra2.setNum(13);
        System.out.println("palabra2 = " + palabra2);
    }
    
}
