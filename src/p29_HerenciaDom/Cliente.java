package p29_HerenciaDom;

import java.util.Date;

public class Cliente extends Persona {
    
    /* ATRIBUTOS */
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    /* CONSTRUCTORES */
    
    // Constructor para inicializar el único atributo privado de la clase Cliente que es modificable manualmente
    public Cliente(Date fechaRegistro, boolean vip) {
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        Cliente.contadorCliente++;
        this.idCliente = Cliente.contadorCliente;
    }
    
    // Constructor para inicializar todos los atributos que debe de tener un objeto de la clase Cliente
    public Cliente(String nombre, Date fechaRegistro, boolean vip, String direccion) {
        this.nombre = nombre;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.direccion = direccion;
        Cliente.contadorCliente++;
        this.idCliente = Cliente.contadorCliente;
    }
    
    // Definimos un constructor que llena todos los atributos necesarios pero usando la palabra reservada super
    public Cliente(Date fechaRegistro, boolean vip, String nombre, String direccion) {
        super(nombre, direccion); // Claramente, si el constructor de la clase padre tuviera 100 atributos, esto mejora notablemente el código
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        Cliente.contadorCliente++;
        this.idCliente = Cliente.contadorCliente;
    }
    
    // Finalmente creamos un constructor que define TODOS los atributos de la clase hija y de la clase padre.
    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    } // Este es el mejor constructor que podemos definir para un objeto de la subclase Cliente.
    
    /* MÉTODOS */
    
    // El atributo privado idCliente es generado automáticamente, por lo tanto solo tiene método get
    public int getIdCliente() {
        return this.idCliente;
    }
    
    // Get y set del atributo privado Date
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    // Get y set del atributo privado de tipo boolean vip
    public boolean isVip() {
        return this.vip;
    }
    
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    // Get y set del atributo privado (y estático) contadorCliente
    public int getContadorCliente() {
        return Cliente.contadorCliente;
    }
    
    public void setContadorCliente(int contadorCliente) {
        Cliente.contadorCliente = contadorCliente;
    }
    
    // Método toString() para los objetos de la clase Cliente creado manualmente
//    @Override
//    public String toString() {
//        return "Cliente[nombre: " + this.nombre + 
//                ", idCliente: " + this.idCliente + 
//                ", fechaRegistro: " + this.fechaRegistro + 
//                ", vip: " + this.vip + 
//                ", direccion: " + this.direccion + "] \n";
//    }

    // Método toString() para los objetos de la clase Cliente creado con la clase StringBuilder y el compilador.
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("idCliente: ").append(this.idCliente);
        sb.append(", fechaRegistro: ").append(this.fechaRegistro);
        sb.append(", vip: ").append(this.vip);
        // Agregamos los datos que faltan de nuestro cliente usando el método toString de la clase padre
        sb.append(", ").append(super.toString());
        sb.append("} \n");
        return sb.toString();
    }

}
