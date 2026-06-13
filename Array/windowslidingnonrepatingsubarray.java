class Solution {
    public int lengthOfLongestSubstring(String s) {

         int maxWindowSize = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int i=0 , j=0 ;
        int sizeString = s.length();
        
        while(j< sizeString){
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1 );
     
             if(map.size() == j-i+1){
                maxWindowSize = Math.max(maxWindowSize ,j-i+1);
                j++;
            }
            else if( map.size() < j-i+1){
                while(map.size() < j-i+1){
                    map.put(s.charAt(i),map.get(s.charAt(i)) - 1 );
                    if(map.get(s.charAt(i)) == 0){
                        map.remove(s.charAt(i));
                    }
                    i++;
                }
                j++;
                
            }
            
        }
        return maxWindowSize;
        
    }
}