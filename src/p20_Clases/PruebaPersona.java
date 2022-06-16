package p20_Clases;

import java.util.Scanner;

public class PruebaPersona {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Creamos el objeto "adulto1" de nuestra clase Persona.
        Persona adulto1 = new Persona();
        // Modificamos los valores de los atributos de este objeto.
        adulto1.nombre = "Miguel Torres";
        adulto1.genero = "Masculino";
        adulto1.edad = 28;
        // Repetimos el proceso con un 2do objeto.
        Persona adulto2 = new Persona();
        adulto2.nombre = "Alejandro Torres";
        adulto2.genero = "Masculino";
        adulto2.edad = 33;
        // Y usamos el método de desplegar información de los atributos de cada objeto.
        adulto1.info();
        adulto2.info();
        // También podemos visualizar información de cada objeto, imprimiéndolo directamente.
        System.out.println("Información de los objetos creados: ");
        System.out.println(" adulto1 = " + adulto1);
        System.out.println(" adulto2 = " + adulto2 + "\n");
        // Vamos a crear un 3er objeto y vamos a desplegar su información antes de definirla.
        Persona adulto3 = new Persona();
        adulto3.info();
    }

}
