import java.util.*;
public class efficientLogestSubarray {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int res = 0;
        int pre_sum = 0;
        int n = arr.length;
        HashMap<Integer,Integer> m = new HashMap<>();
        for(int i=0;i<n;i++){
            pre_sum += arr[i];
            if(pre_sum == k){
                res =  i+1; 
            }
            if (!m.containsKey(pre_sum)) {
                m.put(pre_sum, i);
            }
            if(m.containsKey((pre_sum - k))){
                res = Math.max(res,(i- m.get(pre_sum - k)));
            }
        }
        return res;
    }
}

