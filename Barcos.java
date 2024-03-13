import java.util.Scanner;

public class Barcos{
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        Scanner leer = new Scanner(System.in);
        int barcos = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random()*2);
                if(matriz[i][j] == 1){
                    barcos++;
                }
            }
        }

        int intento = 5, hit=0;
        int x,y;  
        do{
            do{
                System.out.print("Coord x = ");
                x = leer.nextInt();
            }while(x < 0 || x > 4);
            do{
                System.out.print("Coord y = ");
                y = leer.nextInt();
            }while(y < 0 || y > 4);
            
            if(matriz[y][x] == 1){
                System.out.println("Hit!!!");
                hit++;
            }else{
                System.out.println("Miss");
                intento--;
            }
        }while(intento > 0 && hit != barcos);
        if(intento > 0){
            System.out.println("Victoria!!!");
        }else{
            System.out.println("Derrota");
        }
        leer.close();
        /*for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }*/
    }
}