import java.util.*;
public class naivemorethannkOccrenece {
    // Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int k) {
        // your code here,return the answer
        Arrays.sort(arr);
        int n = arr.length;
        int i=1,count = 1;
        int ans = 0;
        while(i<n){
            while(i<n && arr[i] == arr[i-1]){
                count++;
                i++;
            }
            
            if(count > n/k){
                // return arr[i-1];
                ans++;
            }
            count = 1;
            i++;
        }
         // Check the last element group
        if (count > n / k) {
            ans++;
        }
        return ans;
    }
}