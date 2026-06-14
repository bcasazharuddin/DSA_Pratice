import java.util.*;
public class naiveLongestConsecutiveSubsequence {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here]
        Arrays.sort(arr);
        int n = arr.length;
        int res  = 1, curr = 1;
        for(int i=1;i<n;i++){
            if(arr[i] == arr[i-1]+1){
                curr++;
            }else if(arr[i] != arr[i-1]){
                res = Math.max(res,curr);
                curr = 1;
            }
            
        }
        
        return Math.max(res,curr);
        
    }
}