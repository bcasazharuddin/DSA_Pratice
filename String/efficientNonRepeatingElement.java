package String;
import java.util.*;
public class efficientNonRepeatingElement {
    static final int CHAR = 256;
    public char nonRepeatingChar(String s) {
        // code here
        int []fI = new int[CHAR];
        Arrays.fill(fI,-1);
        for(int i=0;i<s.length();i++){
            if(fI[s.charAt(i)] == -1){
                fI[s.charAt(i)] = i;
            }else{
               fI[s.charAt(i)] = -2; 
            }
        }
        
        int res = Integer.MAX_VALUE;
        for(int i=0;i<CHAR;i++){
            if(fI[i]>=0){
                res = Math.min(res,fI[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ? '$' : s.charAt(res);
        
    }
}
