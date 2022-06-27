package p31_MetodosDom;

public class Sobrecarga {
    
    // Primer método con dos argumentos enteros y retorno entero
    public static int multiplica(int a, int b) {
        System.out.println("Usando método con argumentos enteros: ");
        return a*b;
    }
    
    // Segundo método con dos argumentos double y retorno double
    public static double multiplica(double num1, double num2) {
        System.out.println("Usando método con argumentos double: ");
        return num1*num2;
    }
    
}
