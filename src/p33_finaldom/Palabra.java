package p33_finaldom;

// Al definir la clase Palabra como de tipo final, no podrá heredar nada a ninguna otra clase.
public class Palabra {
    
    // Atributo que se va a convertir en una constante por la manera en que lo definimos.
    public static final double PI = 3.1416;
    // Atributos normales.
    private String palabra;
    protected int num;
    
    // Método que si se puede sobreescribir.
    public static void saludo() {
        System.out.println("Hola Mundo");
    }
    
    // Método que no se puede sobrescribir.
    public static final void mensaje() {
        System.out.println("Este método no puede sobreescribirse porque es final.");
    }
    
    // Getters y setters.
    
    public String getPalabra() {
        return this.palabra;
    }
    
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }
    
    public int getNum() {
        return this.num;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    
    // Método toString de la clase palabra.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Palabra[");
        sb.append("palabra: ").append(palabra);
        sb.append(", num: ").append(num);
        sb.append(", memoria: ").append(super.toString());
        sb.append(']');
        return sb.toString();
    }
    
}
