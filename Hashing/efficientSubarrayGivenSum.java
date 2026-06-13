import java.util.*;
public class efficientSubarrayGivenSum {
    public static boolean subArraySum(int[] arr, int k) {
        // code here.
        int n = arr.length;
        Set<Integer> h = new HashSet<Integer>();
        int pre_sum = 0;
        for(int x : arr){
            pre_sum += x;
            if(pre_sum == k){
                return true;
            }
            if(h.contains(pre_sum - k)){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
    }
}

