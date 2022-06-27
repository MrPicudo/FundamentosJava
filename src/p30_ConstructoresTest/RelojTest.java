package p30_ConstructoresTest;

import p30_ConstructoresDom.*;

public class RelojTest {
    
    // Método principal (no es una clase)
    public static void main(String[] args) {
        // Objeto 1
        Samsung galaxy = new Samsung("Watch S2 clasic", 3990.00);
        System.out.println("galaxy = " + galaxy);
        // Objeto 2
        Samsung galaxy2 = new Samsung("Watch S3", 5990.00, 14, 10, 55);
        System.out.println("galaxy2 = " + galaxy2);
    }
    
}
