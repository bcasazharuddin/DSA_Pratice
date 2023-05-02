
public class EfficientRemoveDuplicate {

    public int removeDuplicates(int[] A) {

        int n = A.length;
        int res = 1;
        for (int i = 1; i < n; i++) {
            if (A[res - 1] != A[i]) {
                A[res] = A[i];
                res++;
            }
        }
        return res;
    }
}
