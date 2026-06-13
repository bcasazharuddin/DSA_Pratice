public class naiveSubarrayGivenSum {
    public static boolean subArraySum(int[] arr, int k) {
        // code here.
        int n = arr.length;
        for(int i=0;i<n;i++){
            int curr_sum = 0;
            for(int j=i;j<n;j++){
                curr_sum += arr[j];
                if(curr_sum == k){
                    return true;
                }
            }
        }
        return false;
    }
}

