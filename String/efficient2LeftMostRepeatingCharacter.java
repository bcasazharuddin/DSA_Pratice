package String;

public class efficient2LeftMostRepeatingCharacter {
    static final int CHAR = 256;
    public int repeatedCharacter(String S) {
        // code here
        boolean []visited = new boolean[CHAR];
        int res = -1;
        for(int i=S.length()-1;i>=0;i--){
            if(visited[S.charAt(i)]){
                res = i;
            }else{
                visited[S.charAt(i)] = true;
            }
        }
        return res;
    }
}