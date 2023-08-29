class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        Arrays.fill(res , -1);
     
       int last = -1;
        for(int i= nums.length-1 ; i >= 0 ;i--){
          if(nums[i] == target){
             last = i ; 
             break ; 
          }
        }
        res[1] = last;
        return res;
    }

 
}