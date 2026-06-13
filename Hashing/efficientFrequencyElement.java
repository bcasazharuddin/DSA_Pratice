import java.util.*;
class efficientFrequencyElement {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {10, 20, 10, 5, 20};
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int x : arr){
            hm.put(x,hm.getOrDefault(x,0)+1);
        }
        
        for(Map.Entry<Integer,Integer>  m : hm.entrySet()){
            System.out.println(m.getKey() + " "+ m.getValue());
        }
        
    }
}