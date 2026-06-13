
import java.util.*;
public class HashMapContainsValueGet {

    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        HashMap<String,Integer> h = new HashMap<>();
        // Add elements to the map
        h.put("gfg",10);
        h.put("ide",15);
        h.put("courses",20);
        if(h.containsValue(15)){
             System.out.println("Yes"); 
        }else{
            System.out.println("No");  
        }

        System.out.println(h.get("ide"));
         System.out.println(h.get("present"));
    }
    
}