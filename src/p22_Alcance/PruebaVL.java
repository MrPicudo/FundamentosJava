package p22_Alcance;

public class PruebaVL {
    
    public static void main(String[] args) {
        // El método main es estático y solo puede llamar a otros métodos estáticos.
        int e = 20, f = 30;
        VariablesLocales objeto = new VariablesLocales();
        /* Vamos a mandar a llamar desde el objeto de nuestra clase, su método asociado "metodo2" que tiene 
           argumentos, los cuales se van a definir usando el método con retorno "metodo2", que también está
           referenciado al objeto que creamos de nuestra clase. Si queremos llamar a métodos por si solos desde
           la clase main, sin que estén relacionados a algún objeto de la clase, entonces debemos de llamar a 
           otro método estático. */
        objeto.metodo2(objeto.metodo3(), objeto.metodo3());
        // Y finalmente mandamos a llamar a un método solito desde el método main.
        metodo4();
    }
    
    public static void metodo4() {
        System.out.println("\nEste es un método estático que se mandó a llamar desde la clase main.");
    }
    
}
