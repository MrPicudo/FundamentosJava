package p24_Pasos;

public class PorValor {
    
    public static void main(String[] args) {
        // Definimos una variable inicializada y la pasamos por valor al método cambio.
        var num = 13;
        cambio(num);
        System.out.println("Valor de a en main: a = " + num);
    }
    
    // El paso por valor utiliza variables de tipo primitivo.
    public static void cambio(int a) {
        System.out.println("Valor recibido: a = " + a);
        a = 117;
        System.out.println("Valor modificado: a = " + a);
    }
}
