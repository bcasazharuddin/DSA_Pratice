import java.util.*;
public class kmpAlogorithm {
    static final int d = 256;
    static final int q = 101;
    ArrayList<Integer> search(String pat, String txt) {
        // code here
        //rabin karp algorithm
        ArrayList<Integer> result = new ArrayList<>();
        int m = pat.length();
        int n = txt.length();
        // compute (d^(m-1))%q
        int[] lps = new int[n];
        fillLPS(pat,lps);
        int i=0,j=0;
        while(i<n){
            if(pat.charAt(j) == txt.charAt(i)){
                i++;
                j++;
            }
            if(j==m){
                result.add((i-j));
                j = lps[j-1];
            }else if(i<n && pat.charAt(j) != txt.charAt(i)){
                if(j==0){
                    i++;
                }else{
                    j = lps[j-1];
                }
            }
        }
        
        return result;
    }
    
    static void fillLPS(String str,int lps[]){
        int n = str.length(), len =0;
        lps[0] = 0;
        int i=1;
        while(i<n){
            if(str.charAt(i) ==str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len == 0){
                    lps[i] = 0;
                    i++;
                }else{
                    len = lps[len-1];
                }
            }
        }
        
    }
    
}
