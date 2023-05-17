
public class MinimumGroupFLIps {

    public void minFlips(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] != nums[0]) {
                    System.out.print("FRom" + i + "to");
                } else {
                    System.out.println(i - 1);
                }
            }
        }

        if (nums[n - 1] != nums[0]) {
            System.out.println(n - 1);
        }

    }
}
