
import java.util.*;
public class HashMapPUtSizeIterator {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        HashMap<String,Integer> h = new HashMap<>();
        // Add elements to the map
        h.put("gfg",10);
        h.put("ide",15);
        h.put("courses",20);
        System.out.println(h);
        System.out.println(h.size());
        for(Map.Entry<String,Integer> e : h.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
        }
    }
    
}