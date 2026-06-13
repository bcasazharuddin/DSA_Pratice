public class naiveSubarraywithzerosum {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        // Your code here
        int n = arr.length;
        for(int i=0;i<n;i++){
            int curr_sum = 0;
            for(int j=i;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum == 0){
                    return true;
                }
            }
            
        }
        return false;
        
    }
}