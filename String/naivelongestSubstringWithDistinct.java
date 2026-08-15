public class naivelongestSubstringWithDistinct {
    static boolean areDistinct(String str,int i,int j){
        boolean visited[] = new boolean[256];
        for(int k=i;k<=j;k++){
            if(visited[str.charAt(k)] == true){
                return false;
            }
            visited[str.charAt(k)] = true;
        }
        return true;
    }
    public int longestUniqueSubstr(String s) {
        // code here
        int n = s.length();
        int res =0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(areDistinct(s,i,j)){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}