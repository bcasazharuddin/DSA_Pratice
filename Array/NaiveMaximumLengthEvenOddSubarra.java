
public class NaiveMaximumLengthEvenOddSubarra {

    public int evenodd(int arr[]) {
        int res = 1;
        for (int i = 0; i < arr.length; i++) {
            int curr = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[j] % 2 != 0 && arr[j - 1] % 2 == 0) || (arr[j - 1] % 2 != 0 && arr[j] % 2 == 0)) {
                    curr++;
                } else {
                    break;
                }
            }
            res = Math.max(res, curr);
        }
        return res;
    }
}
