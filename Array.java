import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        String[] array = {"b","a","d","c"};
        Arrays.sort(array);
        for(String s : array){
            System.out.println(s);
        }
    }
}
