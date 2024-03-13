import java.util.ArrayList;

public class prueba {
    public static void main(String[] args) {
        ArrayList<Integer> colors = new ArrayList<Integer>();
        colors.add(3);
        colors.add(5);
        colors.add(2);
        colors.add(9);
        colors.add(1);
        
        System.out.println(colors.get(1));
        colors.remove(1);
        System.out.println(colors.get(1));

    }
}