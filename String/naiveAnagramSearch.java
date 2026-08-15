class naivrAnagramSearch {
    static final int CHAR = 256;
    static boolean anagram(String pat,String txt,int i){
        int[] count = new int[CHAR];
        for(int j=0;j<pat.length();j++){
            count[pat.charAt(j)]++;
            count[txt.charAt(i+j)]--;
        }
        for(int j=0;j<CHAR;j++){
            if(count[j] != 0){
                return false;
            }
        }
        return true;
    }
    public boolean isAnagram(String s, String t) {
        int n = s.length();
        int m = t.length();
        if(m != n){
            return false;
        }
        for(int i=0;i<=n-m;i++){
            if(anagram(t,s,i)){
                return true;
            }
        }
        return false;
    }


}