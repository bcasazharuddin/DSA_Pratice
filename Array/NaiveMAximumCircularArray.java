
class Solution {

    public int maxSubarraySumCircular(int[] nums) {
        int res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            int currMAx = nums[i];
            int currSum = nums[i];
            for (int j = 1; j < nums.length; j++) {
                int index = (i + j) % nums.length;
                currSum += nums[index];
                currMAx = Math.max(currMAx, currSum);
            }
            res = Math.max(currMAx, res);
        }
        return res;
    }
}
