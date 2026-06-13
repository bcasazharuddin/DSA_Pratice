import java.util.*;
public class improveCOuntDistinct {
    static int distinct(int arr[]) {
        // code here
        Integer[] temp = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        HashSet<Integer> h = new HashSet<>(Arrays.asList(temp));
        return h.size();
    }
}