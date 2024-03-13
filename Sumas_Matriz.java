import java.util.Scanner;

public class Sumas_Matriz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Introduzca su tamaño...");
        System.out.print("Alto = ");
        int alto = leer.nextInt();
        System.out.print("Ancho = ");
        int ancho = leer.nextInt();
        int[][] matriz1 = new int[alto][ancho];
        int[][] matriz2 = new int[alto][ancho];
        int[][] matrizRes = new int[alto][ancho];
        
        System.out.println("Introduzca los valores...");
        System.out.println("1º Matriz");
        for(int x = 0; x < matriz1.length; x++){
            for(int y = 0; y < matriz1[x].length; y++){
                matriz1[x][y] = leer.nextInt();
            }
        }
        System.out.println("2º Matriz");
        for(int x = 0; x < matriz2.length; x++){
            for(int y = 0; y < matriz2[x].length; y++){
                matriz2[x][y] = leer.nextInt();
            }
        }

        for(int x = 0; x < matrizRes.length; x++){
            for(int y = 0; y < matrizRes[x].length; y++){
                matrizRes[x][y] = matriz1[x][y] + matriz2[x][y];
            }
        }
        System.out.println();

        System.out.println("Suma de ambas");
        System.out.println("1º Matriz");
        for(int x = 0; x < matriz1.length; x++){
            for(int y = 0; y < matriz1[x].length; y++){
                System.out.print(matriz1[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("2º Matriz");
        for(int x = 0; x < matriz2.length; x++){
            for(int y = 0; y < matriz2[x].length; y++){
                System.out.print(matriz2[x][y] + " ");;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Resultado Matriz");
        for(int x = 0; x < matrizRes.length; x++){
            for(int y = 0; y < matrizRes[x].length; y++){
                System.out.print(matrizRes[x][y] + " ");;
            }
            System.out.println();
        }
        leer.close();
    }
}