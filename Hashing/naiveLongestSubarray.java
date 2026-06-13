public class naiveLongestSubarray {
    public int longestSubarray(int[] arr, int k) {
        // code here
        int res = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            int curr_sum = 0;
            for(int j=i;j<n;j++){
                curr_sum +=arr[j];
                if(curr_sum == k){
                    res = Math.max(res,j-i+1);
                }
            }
        }
        return res;
    }
}
