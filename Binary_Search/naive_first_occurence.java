class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        Arrays.fill(res , -1);
        for(int i=0 ; i< nums.length ;i++){
            if(nums[i] == target){
               res[0] = i;
               break;
            }

        }
        return res;
    }
}