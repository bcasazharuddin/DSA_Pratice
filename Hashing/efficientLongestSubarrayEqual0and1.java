import java.util.HashMap;

public class efficientLongestSubarrayEqual0and1 {
    public int maxLen(int[] arr) {
        // Your code here
        int n = arr.length;
        int res = 0;
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = (arr[i]==0 ? -1 : 1);
        }
        
        for(int i=0;i<n;i++){
            sum += arr[i];
            if(sum == 0){
                res = i+1;
            }
            
            if (!hm.containsKey(sum)) {
                hm.put(sum, i);
            } else {
                res = Math.max(res, i - hm.get(sum));
            }
        }
        
        return res;
        
    }
}

