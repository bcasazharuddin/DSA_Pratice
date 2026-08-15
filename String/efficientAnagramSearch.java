package String;

public class efficientAnagramSearch {
    static final int CHAR = 256;
    static boolean areSame(int CT[],int CP[]){
        for(int i=0;i<CHAR;i++){
            if(CT[i] != CP[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram(String s, String t) {
        if (s.length() > t.length()) {
            return false;
        }
        int[] CT = new int[CHAR];
        int[] CP = new int[CHAR];
        for(int i=0;i<s.length();i++){
            CT[t.charAt(i)]++;
            CP[s.charAt(i)]++;
        }
        for(int i=s.length();i<t.length();i++){
            if(areSame(CT,CP)){
                return true;
            }
            CT[t.charAt(i)]++;
            CT[t.charAt(i-s.length())]--;
        }
        return areSame(CT, CP);
    }
}