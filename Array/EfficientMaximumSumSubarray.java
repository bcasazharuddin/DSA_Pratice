
public class EfficientMaximumSumSubarray {

    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int currValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currValue = Math.max(currValue + nums[i], nums[i]);

            res = Math.max(currValue, res);
        }
        return res;
    }
}
