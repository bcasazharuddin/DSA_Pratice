package String;
import java.util.*;
public class naiveAnagram {
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m != n){
            return false;
        }
        char a1[] = s.toCharArray();
        Arrays.sort(a1);
        s = new String(a1);
        char a2[] = t.toCharArray();
        Arrays.sort(a2);
        t = new String(a2);
        return s.equals(t);
    }
}