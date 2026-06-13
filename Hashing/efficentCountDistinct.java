import  java.util.*;
public class efficentCountDistinct {
    static int distinct(int arr[]) {
        // code here
        int n = arr.length;
        HashSet<Integer> h = new HashSet<>();
        for(int i=0;i<n;i++){
            h.add(arr[i]);
        } 
        return h.size();
    }
}