package String;

public class efficientAnagram {
    static final int CHAR = 256;
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m != n){
            return false;
        }
        
        int count[] = new int[CHAR];
        for(int i=0;i<n;i++){
            count[t.charAt(i)]++;
            count[s.charAt(i)]--;
        }

        for(int i=0;i<CHAR;i++){
            if(count[i] != 0){
                return false;
            }
        }

        return true;
    }
}
