package p37_proyectofinaltest;

import p37_proyectofinaldom.*;

public class MundoPC {
    public static void main(String[] args) {
        // Primero creamos objetos de tipo ratón, teclado y monitor, para después crear objetos de tipo computadora.
        Monitor monitorHP = new Monitor("HP", 27);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        // Ya podemos crear un objeto de tipo computadora.
        Computadora computadoraHP = new Computadora("Pavilion", monitorHP, tecladoHP, ratonHP);
        // Repetimos el proceso para crear una segunda computadora.
        Monitor monitorGamer = new Monitor("Gamer", 34);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Alienware", monitorGamer, tecladoGamer, ratonGamer);
        // Ya con dos computadoras podemos crear un objeto de tipo Orden que contiene el arreglo de computadoras.
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
    }
}
