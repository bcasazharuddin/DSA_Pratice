
public class NaiveRemoveDuplicate {

    public int removeDuplicates(int[] A) {

        int N = A.length;
        int temp[] = new int[N];
        temp[0] = A[0];
        int index = 1;

        for (int i = 1; i < N; i++) {
            if (A[i] != temp[index - 1]) {
                temp[index] = A[i];
                index++;
            }
        }
        for (int i = 0; i < index; i++) {
            A[i] = temp[i];
        }
        return index;
    }
}
