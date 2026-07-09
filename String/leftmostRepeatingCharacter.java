package String;

public class leftmostRepeatingCharacter {
    public int repeatedCharacter(String S) {
        // code here
        for(int i=0;i<S.length();i++){
            for(int j=i+1;j<S.length();j++){
                if(S.charAt(i) == S.charAt(j)){
                    return i;
                }
            }
        }
        return -1;
    }
}