package String;

public class betterLeftMostNonRepeating {
    static final int CHAR = 256;
    public char nonRepeatingChar(String s) {
        // code here
        int []count = new int[CHAR];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)]++;
        }
        
        for(int i=0;i<s.length();i++){
            if(count[s.charAt(i)] == 1){
                return s.charAt(i);
            }
        }
        
        return '$';
        
    }
}
