import java.util.ArrayList;
import java.util.Scanner;

public class Sumas_Matriz_Repit {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int repit = 1;
        while(repit != 0){
            System.out.println("Introduzca su tamaño...");
            System.out.print("Alto = ");
            int alto = leer.nextInt();
            System.out.print("Ancho = ");
            int ancho = leer.nextInt();
            int tamaño = alto * ancho;
            ArrayList<Integer> matriz1 = new ArrayList<>();
            ArrayList<Integer> matriz2 = new ArrayList<>();
            ArrayList<Integer> matrizRes = new ArrayList<>();
            System.out.println("Introduzca los valores...");
            System.out.println("1º Matriz");
            for(int x = 0; x < tamaño; x++){
                matriz1.add(leer.nextInt());
            }
            System.out.println("2º Matriz");
            for(int x = 0; x < tamaño; x++){
                matriz2.add(leer.nextInt());
            }

            for(int x = 0; x < tamaño; x++){
                matrizRes.add(matriz1.get(x) + matriz2.get(x));
            }
            System.out.println();

            System.out.println("Suma de ambas");
            int count = 0;
            System.out.println("1º Matriz");
            for(int x = 0; x < alto; x++){
                for(int y = 0; y < ancho; y++){
                    System.out.print(matriz1.get(count) + " ");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
            count = 0;
            System.out.println("2º Matriz");
            for(int x = 0; x < alto; x++){
                for(int y = 0; y < ancho; y++){
                    System.out.print(matriz2.get(count) + " ");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
            count = 0;
            System.out.println("Resultado Matriz");
            for(int x = 0; x < alto; x++){
                for(int y = 0; y < ancho; y++){
                    System.out.print(matrizRes.get(count) + " ");
                    count++;
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Quieres Salir (Introduzca '0' si es asi):");
            repit = leer.nextInt();
        }
        System.out.println("Adios! o/");
        leer.close();
    }
}