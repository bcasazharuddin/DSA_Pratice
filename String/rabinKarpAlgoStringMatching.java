package String;
import java.util.*;
public class rabinKarpAlgoStringMatching {
    static final int d = 256;
    static final int q = 101;
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        //rabin karp algorithm
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        // compute (d^(m-1))%q
        int h=1;
        for(int i=1;i<=m-1;i++){
            h = (h*d)%q;
        }
        // compute p and to
        int p=0,t=0;
        for(int i=0;i<m;i++){
            p = (p*d + pat.charAt(i))%q;
            t = (t*d + txt.charAt(i))%q;
        }
        
        
        for(int i=0;i<=(n-m);i++){
            // check for hit
            if(p==t){
                boolean flag = true;
                for(int j=0;j<m;j++){
                    if(txt.charAt(i+j) != pat.charAt(j)){
                        flag = false;
                        break;
                    }
                }
                if(flag == true){
                    result.add(i);
                }
            }
            
            if(i<n-m){
                t = (d*(t-txt.charAt(i)*h)+ txt.charAt(i+m))%q;

                if(t<0){
                    t = t+q;
                }
            }
        }
        return result;
        
    }
    
}