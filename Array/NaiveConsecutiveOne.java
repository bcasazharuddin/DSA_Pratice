class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            count = 0;
            for(int j=i;j<nums.length;j++){
                if(nums[j] == 1){
                    count += 1;
                    res = Math.max(res,count);
                }
                else{
                    break;
                }
            }

        }

        return res;
    }
}