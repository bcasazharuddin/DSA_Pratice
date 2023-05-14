
public class EfficientMAximumCircularArray {

    public int maxSubarraySumCircular(int[] nums) {
        int normal = Normal(nums);
        if (normal < 0) {
            return normal;
        }
        int arr_sum = 0;
        for (int i = 0; i < nums.length; i++) {
            arr_sum += nums[i];
            nums[i] = -nums[i];
        }
        int max_circular = arr_sum + Normal(nums);
        return Math.max(max_circular, normal);
    }

    public int Normal(int[] nums) {
        int max = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(currSum + nums[i], nums[i]);
            max = Math.max(max, currSum);

        }
        return max;
    }
}
