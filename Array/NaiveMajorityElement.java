
public class NaiveMajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {

            int count = 0;
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
                if (count > n / 2) {
                    return nums[i];
                }
            }
        }
        return 0;
    }
}