public class Mayor_Menor_Array {
    public static void main(String[] args) {
        int[] numeros = {983,654,194,263,999};
        int num = numeros[0];
        for(int x = 0; x < numeros.length; x++){
            if(num < numeros[x]){
                num = numeros[x];
            }
        }
        System.out.println("Numero mayor: " + num);
        for(int x = 0; x < numeros.length; x++){
            if(num > numeros[x]){
                num = numeros[x];
            }
        }
        System.out.println("Numero menor: " + num);
    }
}
