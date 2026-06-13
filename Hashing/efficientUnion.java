import java.util.*;
public class efficientUnion {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] a = {7, 1, 5, 2, 3, 6};
        int[] b = {3, 8, 6, 20, 7};
        Set<Integer> union = new HashSet<>();
        for(int x : a){
            union.add(x);
        }
        for(int x : b){
           union.add(x);
        }
        System.out.print(union);
        
    }
}
