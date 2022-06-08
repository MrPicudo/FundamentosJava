package P08_TiposPrimitivos;
import java.util.Scanner;

public class Enteros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Vamos a crear variables de tipo entero y visualizar su información.
        System.out.println("TABLA DE TIPOS PRIMITIVOS ENTEROS. \n");
        System.out.println("Tipo primitivo \t Valor mínimo \t\t Valor máximo \t\t Tamaño en bytes \n");
        System.out.println("Byte \t\t  " + Byte.MIN_VALUE + "\t\t\t  " + Byte.MAX_VALUE + "\t\t\t  " + Byte.BYTES);
        System.out.println("Short \t\t  " + Short.MIN_VALUE + "\t\t\t  " + Short.MAX_VALUE + "\t\t\t  " + Short.BYTES);
        System.out.println("Int \t\t  " + Integer.MIN_VALUE + "\t\t  " + Integer.MAX_VALUE + "\t\t  " + Integer.BYTES);
        System.out.println("Long \t\t  " + Long.MIN_VALUE + "\t  " + Long.MAX_VALUE + "\t  " + Long.BYTES);
        /* Si superamos el valor de cualquiera de los tipos enteros, nos manda un error, el cual podemos
           forzar a que compile si hacemos un cast explícito poniendo entre paréntesis el tipo de dato */
        short num = (short) 32770;
        System.out.println("num = " + num);
        // Y al parecer lo que hace es que empieza a sobreescribirse del menor número posible al mayor.
        // Si queremos asignar un valor que supere al Integer.MAX_VALUE, debemos agregar una L al final.
        long big = 2147483648L;
        // Esto es porque los números que asignamos en Java son de tipo int por default.
        System.out.println("Número long = " + big);
        // Y podemos hacer un cast de tipo long a tipo int con esta información.
        int bigger = (int)2147483648L;
        System.out.println("Número int superado = " + bigger);
        // Como podemos ver, pasa lo mismo de que se empieza a sobreescribir el valor desde el más pequeño.
    }
}
