import java.util.*;
public class efficientmorethannkOccerence {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int x :arr){
            m.put(x,m.getOrDefault(x,0)+1);
        }
        int n = arr.length;
        int count = 0;
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
            if(e.getValue() > n/k){
               count++;
            }
        }
        return count;
    }
}