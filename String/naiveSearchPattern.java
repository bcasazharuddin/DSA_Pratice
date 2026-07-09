package String;
import java.util.*;
public class naiveSearchPattern {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        
        for(int i=0;i<=(n-m);i++){
            int j ;
            for(j=0;j<m;j++){
                if(pat.charAt(j) != txt.charAt(i+j)){
                     break;
                }
            }
            if(j==m){
                result.add(i);
            }
        }
        return result;
    }
    
}