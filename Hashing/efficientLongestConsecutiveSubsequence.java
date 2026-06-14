public class efficientLongestConsecutiveSubsequence {
    // Function to return length of longest subsequence of consecutive integers.
    public int longestConsecutive(int[] arr) {
        // code here]
        Set<Integer> h = new HashSet<>();
        int n = arr.length;
        int res = 0;
        for(int x : arr){
            h.add(x);
        }
        
        for(int i=0;i<n;i++){
            if(!h.contains(arr[i]-1)){
                int curr = 1;
                while(h.contains(curr + arr[i])){
                    curr++;
                }
                
                res = Math.max(res,curr);
            }
        }
        return res;
    }
}