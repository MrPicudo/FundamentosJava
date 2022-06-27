package p31_MetodosTest;

import p31_MetodosDom.Sobrecarga;

public class SobrecargaTest {
    
    // Podemos acceder a los métodos estáticos de una clase con la sintaxis: nombreClase.nombreMetodo();
    public static void main(String[] args) {
        var producto1 = Sobrecarga.multiplica(13, 17);
        System.out.println("producto1 = " + producto1);
        var producto2 = Sobrecarga.multiplica(3.1416, 100);
        System.out.println("producto2 = " + producto2);
    }
    
}
