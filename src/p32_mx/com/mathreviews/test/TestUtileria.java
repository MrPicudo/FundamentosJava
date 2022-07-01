package p32_mx.com.mathreviews.test;

import p32_mx.com.mathreviews.dom.Utileria;
import static p32_mx.com.mathreviews.dom.Utileria.password;

public class TestUtileria {
    
    public static void main(String[] args) {
        // Mandamos a llamar a un método estático desde la clase que importamos.
        Utileria.imprimir("Hola mundo desde Java en una clase de un paquete externo.");
        // Mandamos a llamar a un método estático que importamos directamente.
        password();
        // Mandamos a llamar a un método de una clase que no hemos importado mediante el nombre completamente calificado de la clase.
        p32_mx.com.mathreviews.dom.Alternativa.nombreCC();
        /* El concepto de nombre completamente calificado se utilizará cuando trabajemos los archivos de configuración */
    }
    
}
