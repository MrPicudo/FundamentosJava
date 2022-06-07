package P04_Inferencia;
import java.util.Scanner;

public class TipoVar {
    /* No se permite el uso de var fuera de un método interno a la clase que define nuestro archivo.
       Es decir, dentro de la clase TipoVar no se puede usar, hasta estar dentro del método main. */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Var infiere el tipo de dato que contiene la variable, pero debe inicializarse siempre.
        var name = "Miguel Torres";
        String res;
        System.out.println("Hola " + name);
        System.out.print("¿Cómo se llama tu perro?: ");
        res = scan.nextLine();
        System.out.println(res + " es un bonito nombre para un perro :D \n");
        // Reglas válidas para identificadores de variables.
        var a = "Empezar con minúscula, es lo más recomendado";
        var _a = "Empezar con guión bajo, no es común";
        var $a = "Empezar con símbolo de dólar, no es común";
        var número = "Usar un acento, está permitido pero no recomendado";
        System.out.println("Al nombrar variables podemos: \n" + a + "\n" + _a + "\n" + $a + "\n" + número);
    }
}
