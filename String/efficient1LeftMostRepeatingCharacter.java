package String;
import java.util.*;
public class efficient1LeftMostRepeatingCharacter {
    static final int CHAR = 256;
    public int repeatedCharacter(String S) {
        // code here
        int []fIndex = new int[CHAR];
        Arrays.fill(fIndex,-1);
        int res = Integer.MAX_VALUE;
        for(int i=0;i<S.length();i++){
            int fi = fIndex[S.charAt(i)];
            if(fi == -1){
                fIndex[S.charAt(i)] = i;
            }else{
                res = Math.min(res,fi);
            }
        }
        
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}
