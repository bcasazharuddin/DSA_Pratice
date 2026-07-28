package String;

public class naiveLPS {
    static int longPropPreSuff(String s,int n){
        // code here
        for(int len = n-1;len > 0 ;len--){
            boolean flag = true;
            for(int i=0;i<len;i++){
                if(s.charAt(i) != s.charAt(n-len+i)){
                    flag = false;
                }
            }
            if(flag == true){
                return len;
            }
        }
        return 0;
    }
    static void fillLPS(String s , int lps[]){
        for(int i=0;i<s.length();i++){
            lps[i] = longPropPreSuff(s,i+1);
        }
    }
    public int getLPSLength(String s) {
        int lps[] = new int[s.length()];
        fillLPS(s,lps);
        return lps[s.length() - 1];        
    }
}