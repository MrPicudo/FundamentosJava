package p34_arreglostest;

public class TestArreglos {
    
    public static void main(String[] args) {
        // Creamos un arreglo de tipo entero instanciando la variable arregloEntero.
        int arregloEntero[] = new int[3];
        int i;
        // Accedemos a los elementos del arreglo.
        for(i=0; i<arregloEntero.length; i++) {
            arregloEntero[i] = 13+2*i;
        }
        // Imprimimos los elementos del arreglo.
        System.out.println("Los elementos del arreglo son:");
        for(i=0; i<arregloEntero.length; i++) {
            System.out.println("   num " + (i+1) + ": " + arregloEntero[i]);
        }
        // Usamos la sintaxis resumida para crear arreglos e inicializarlos en la misma línea.
        String frutas[] = {"Mango", "Naranja", "Uvas", "Sandía", "Melón"};
        for (i=0; i<frutas.length; i++) {
            System.out.println("Frutas = " + frutas[i]);
        }
    }
    
}
