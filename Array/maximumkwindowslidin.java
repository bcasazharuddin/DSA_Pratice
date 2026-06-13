class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int []ans = new int[n-k+1];

        int  i=0;
        int j=0 ;
   
        Deque<Integer> q = new LinkedList<Integer>();
        while(j<n){
            // calculation
            while(q.size()> 0  && q.peekLast() < nums[j]){
                q.removeLast();
            }
            q.add(nums[j]);
            if(j-i+1  < k ){
                j++;
            }
            else if(j-i+1 == k){
                ans[i] = q.peek();
                

                if(q.peek() == nums[i]){
                    q.removeFirst();
                }
                    i++;
                    j++;
            }
        }
        return ans; 
    }
}