package String;

public class recursiveIssubsequnece {
    public boolean isSubsequence(String s, String t) {
        int n = t.length();
        int m = s.length();
        return isSubsequence(s,t,m,n);
    }

    static boolean isSubsequence(String s, String t , int m ,int n){
        if(m == 0){
            return true;
        }
        if(n==0){
          return false;
        }

        if(s.charAt(m-1) == t.charAt(n-1)){
          return isSubsequence(s,t,m-1,n-1);
        }else{
          return isSubsequence(s,t,m,n-1);
        }
    }
}
