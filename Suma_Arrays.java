public class Suma_Arrays {
    public static void main(String[] args) {
        int[] linea_1 = {2, 4, 6, 8};
        int[] linea_2 = {3, 4, 1, 0};
        int[] linea_3 = {9, 9, 4, 2};
        int[] Resultado = new int[linea_1.length];
        for(int x = 0; x < 4; x++){
            Resultado[x] = linea_1[x] + linea_2[x] + linea_3[x];
        }
        for(int x = 0; x < Resultado.length; x++){
            System.out.print(Resultado[x] + " ");
        }
        System.out.println();
    }
}
