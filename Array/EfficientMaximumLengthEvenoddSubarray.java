
public class EfficientMaximumLengthEvenoddSubarray {

    public int maxLengthEvenoddSubArray(int[] arr) {
        int res = 1;
        int currValue = 1;
        for (int i = 1; i < arr.length; i++) {
            if ((arr[i - 1] % 2 == 0 && arr[i] % 2 != 0) || (arr[i] % 2 == 0 && arr[i - 1] % 2 != 0)) {
                currValue++;
                res = Math.max(res, currValue);
            } else {
                currValue = 1;
            }
        }
        return res;

    }
}
