
import java.util.*;
public class HashingContainsRemove {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        HashMap<String,Integer> h = new HashMap<>();
        // Add elements to the map
        h.put("gfg",10);
        h.put("ide",15);
        h.put("courses",20);
        if(h.containsKey("ide")){
             System.out.println("Yes"); 
        }else{
            System.out.println("No");  
        }
        h.remove("ide");
        System.out.println(h.size());
    }
    
}