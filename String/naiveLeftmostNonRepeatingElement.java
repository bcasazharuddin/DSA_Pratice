package String;

public class naiveLeftmostNonRepeatingElement {

    public char nonRepeatingChar(String s) {
        // code here
        for(int i=0;i<s.length();i++){
            boolean flag = false;
            for(int j=0;j<s.length();j++){
                if(i != j && s.charAt(i) == s.charAt(j)){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                return s.charAt(i);
            }
        }
        return '$';
    }
}

