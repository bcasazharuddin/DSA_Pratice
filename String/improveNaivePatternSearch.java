package String;
import java.util.*;
public class improveNaivePatternSearch {
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        
        for(int i=0;i<=(n-m);){
            int j ;
            for(j=0;j<m;j++){
                if(pat.charAt(j) != txt.charAt(i+j)){
                     break;
                }
            }
            if(j==m){
                result.add(i);
            }
            if(j == 0){
               i++; 
            }else{
                i = (i+j);
            }
        }
        return result;
    }
    
}