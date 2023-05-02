
import java.util.ArrayList;

public class ArrayListExample3 {

    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        al.ensureCapacity(100);
        for (int i = 0; i <= 100; i++) {
            al.add(i);
        }
        System.out.println(al);
    }
}
