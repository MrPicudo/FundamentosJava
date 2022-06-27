package p29_HerenciaTest;

import java.util.Date;
import p29_HerenciaDom.*;

public class PersonaTest {
    
    public static void main(String[] args) {
        // Usamos el constructor con un solo argumento para crear un objeto de la clase Empleado.
        Empleado xoch01 = new Empleado(3000.00);
        System.out.println("xoch01 = " + xoch01);
        // Ahora usamos el constructor completo para crear otro objeto de la clase Empleado.
        Empleado xoch02 = new Empleado("Eduardo Pérez", 10000.00, "Cholula, Puebla");
        System.out.println("xoch02 = " + xoch02);
        // Ahora creamos de la misma manera dos objetos de la clase cliente
        Date fecha1 = new Date();
        Cliente venta01 = new Cliente(fecha1, false); // El parámetro Date lo mandamos desde un objeto recién creado.
        System.out.println("venta01 = " + venta01);
        Date fecha2 = new Date();
        Cliente venta02 = new Cliente("Alejandro Villalobos", fecha2, true, "Naucalpan, Estado de México");
        System.out.println("venta02 = " + venta02);
        // Y agregamos un tercer cliente utilizando el constructor que incluye a otro constructor de la clase padre
        Date fecha3 = new Date();
        Cliente venta03 = new Cliente(fecha3, true, "Estefanía Pérez", "Tamaulipas");
        System.out.println("venta03 = " + venta03);
        // Finalmente creamos un objeto de cada subclase que tiene todos los datos de la clase padre Persona
        Empleado xoch03 = new Empleado(36000.00, "Miguel Torres", 'M', 28, "Xochimilco, CDMX");
        System.out.println("xoch03 = " + xoch03);
        Date fecha4 = new Date();
        Cliente venta04 = new Cliente(fecha4, true, "Carolina", 'F', 22, "Coyoacan, CDMX");
        System.out.println("venta04 = " + venta04);
    }
    
}
