package p35_matricestest;

import p35_matricesdom.Alumno;

public class AlumnoTest {
    
    public static void main(String[] args) {
        // Declaramos tres matrices de tipo douuble.
        int matrizA[][] = new int[3][3];
        int matrizB[][] = new int[3][3];
        int matrizC[][] = new int[3][3];
        // Vamos a llenar los datos de las primeras dos matrices.
        int i, j, k, aux;
        for(i=0; i<matrizA.length; i++) {
            for(j=0; j<matrizA[i].length; j++) {
                matrizA[i][j] = i+j;
            }
        }
        for(i=0; i<matrizB.length; i++) {
            for(j=0; j<matrizB[i].length; j++) {
                matrizB[i][j] = 2*i+3*j;
            }
        }
        // Multiplicamos estas matrices:
        for(i=0; i<matrizA.length; i++) {
            for(j=0; j<matrizB[i].length; j++) {
                aux=0;
                for(k=0; k<matrizA[i].length; k++) { // También puede medirse hasta matrizB.length
                    aux += matrizA[i][k]*matrizB[k][j];
                }
                matrizC[i][j] = aux;
            }
        }
        // Mandamos a imprimir las matrices usando un método estático.
        System.out.println("Matriz A: ");
        imprimir(matrizA);
        System.out.println("Matriz B: ");
        imprimir(matrizB);
        System.out.println("Matriz resultante C=AXB: ");
        imprimir(matrizC);
        // Ahora vamos a usar la sintaxis resumida para crear matrices.
        int matrizD[][] = {{13, 21, 39}, {51, 89, 93, 99}, {117, 121, 149, 171, 183}};
        System.out.println("La matriz D es: ");
        imprimir(matrizD);
        
        // Vamos a crear una matriz de objetos.
        Alumno alumnos[][] = new Alumno[6][50];
        // Asignamos una referencia de memoria a cada uno de los objetos de nuestra matriz (estaban en null)
        for(i=0; i<alumnos.length; i++) {
            for(j=0; j<alumnos[i].length; j++) {
                alumnos[i][j] = new Alumno();
            }
        }
        // Podemos imprimir ahora la información de todos los alumnos (que se inicializó por default)
        System.out.println("Información de los alumnos de la preparatoria: ");
        objetos(alumnos);
        // Por último, vamos a usar la sintaxis resumida para crear una matriz de objetos.
        Alumno amigos[][] = {{new Alumno("Cristian", 2005, 9.0), new Alumno("Arturo", 2005, 7.0), new Alumno("Gustavo", 2005, 7.5)}, 
                             {new Alumno("Nelly", 2019, 9.0), new Alumno("Elias", 2020, 8.5), new Alumno("Lalo", 2022, 8.0)}};
        // Imprimimos la información de la matriz de objetos creada con la sintaxis resumida:
        System.out.println("Información de mis amigos: ");
        objetos(amigos);
    }
    
    // Método estático para imprimir las matrices con variables primitivas.
    public static void imprimir(int a[][]) {
        for(var i=0; i<a.length; i++) {
            System.out.print(" ");
            for(var j=0; j<a[i].length; j++) {
                System.out.print(a[i][j] + "   ");
            }
            System.out.println(" ");
        }
        System.out.print("\n");
    }
    
    // Método estático para imprimir las matrices con variables de tipo Object.
    public static void objetos(Object e[][]) { // El argumento es de tipo Object para recibir matrices de cualquier clase.
        for(int i=0; i<e.length; i++) {
            for(int j=0; j<e[i].length; j++) {
                System.out.println(" Alumno #" + (j+1) + " del grado " + (i+1) + ": " + e[i][j].toString());
            }
            System.out.print("\n");
        }
    }
    
}
