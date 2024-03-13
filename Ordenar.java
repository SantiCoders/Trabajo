import java.util.Scanner;
import java.util.Arrays;

public class Ordenar {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cantidad;
        boolean comprob = false;
        do{
            System.out.print("Introduzca cuantos valores quieres poner: ");
            cantidad = leer.nextInt();
            if(cantidad < 2){
                System.out.println("No se puede ordenar con esa cantidad de valores");
            }
        }while(cantidad < 2);
        float[] numeros = new float[cantidad];
        System.out.print("Introduzca sus valores: ");
        for(int x = 0; x < numeros.length; x++){
            numeros[x] = leer.nextFloat();
        }

        System.out.print("Orden introducido:   ");
        for(int x = 0; x < numeros.length; x++){
            System.out.print(numeros[x] + " ");
        }
        System.out.println();

        float num;
        while (comprob == false) {
            boolean correcto = true;
            for(int x = 0; x < numeros.length -1; x++){
                if(numeros[x] > numeros[x+1]){
                    num = numeros[x];
                    numeros[x] = numeros[x+1];
                    numeros[x+1] = num;
                    correcto = false;
                }
            }
            if(correcto == true){
                comprob = true;
            }
        }
        
        
        System.out.print("Orden ordenado:      ");
        for(int x = 0; x < numeros .length; x++){
            System.out.print(numeros[x] + " ");
        }
        System.out.println();
        leer.close();
    }
}
