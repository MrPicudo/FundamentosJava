package P16_EstructurasSelectivas;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /* Ingresa el color y te dice si es primario o su combinación de colores */
        boolean cen = true;
        while (cen) {
            System.out.print("Escribe un color del arcoíris o escribe salir: ");
            var color = scan.nextLine();
            switch (color) {
                case "rojo", "Rojo", "ROJO" -> {
                    System.out.println("El rojo es un color primario. \n");
                }
                case "amarillo", "Amarillo", "AMARILLO" -> {
                    System.out.println("El amarillo es un color primario. \n");
                }
                case "azul", "Azul", "AZUL" -> {
                    System.out.println("El azul es un color primario. \n");
                }
                case "verde", "Verde", "VERDE" -> {
                    System.out.println("El verde es un color secundario.");
                    System.out.println("Se obtiene de la combinación de amarillo y azul. \n");
                }
                case "naranja", "Naranja", "NARANJA" -> {
                    System.out.println("El naranja es un color secundario.");
                    System.out.println("Se obtiene de la combinación de rojo y amarillo. \n");
                }
                case "morado", "Morado", "MORADO" -> {
                    System.out.println("El morado es un color secundario.");
                    System.out.println("Se obtiene de la combinación de rojo y azul. \n");
                }
                case "cafe", "Cafe", "CAFE" -> {
                    System.out.println("El cafe es un color secundario.");
                    System.out.println("Se obtiene de la combinación de los tres colores primarios. \n");
                }
                case "salir", "Salir", "SALIR" -> {
                    System.out.println("Programa terminado. \n");
                    cen = false;
                }
                default -> {
                    System.out.println("Color desconocido. \n");
                }
            }
        }
    }

}
