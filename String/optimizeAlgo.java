package String;

public class optimizeAlgo {
    static void fillLPS(String s , int lps[]){
        int n = s.length(), len =0;
        lps[0] = 0;
        int i=1;
        while(i<n){
            if(s.charAt(i) == s.charAt(len)){
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
    public int getLPSLength(String s) {
        int lps[] = new int[s.length()];
        fillLPS(s,lps);
        return lps[s.length() - 1];        
    }
}