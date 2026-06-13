import java.util.*;
public class efficicentSubarraywithzerosum {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int n = arr.length;
        HashSet<Integer> h = new HashSet<>();
        int pre_sum = 0;
        for(int i=0;i<n;i++){
            pre_sum += arr[i];
            if(h.contains(pre_sum)){            
                return true;
            }
            if(pre_sum == 0){
                return true;
            }
            h.add(pre_sum);
        }
        return false;
        
    }
}