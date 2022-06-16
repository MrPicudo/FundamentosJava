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
            switch (color.toLowerCase()) {
                case "rojo" -> {
                    System.out.println("El rojo es un color primario. \n");
                }
                case "amarillo" -> {
                    System.out.println("El amarillo es un color primario. \n");
                }
                case "azul" -> {
                    System.out.println("El azul es un color primario. \n");
                }
                case "verde" -> {
                    System.out.println("El verde es un color secundario.");
                    System.out.println("Se obtiene de la combinación de amarillo y azul. \n");
                }
                case "naranja" -> {
                    System.out.println("El naranja es un color secundario.");
                    System.out.println("Se obtiene de la combinación de rojo y amarillo. \n");
                }
                case "morado" -> {
                    System.out.println("El morado es un color secundario.");
                    System.out.println("Se obtiene de la combinación de rojo y azul. \n");
                }
                case "cafe" -> {
                    System.out.println("El cafe es un color secundario.");
                    System.out.println("Se obtiene de la combinación de los tres colores primarios. \n");
                }
                case "salir" -> {
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
