public class naiveUnion {
    static boolean exists(int[] arr, int size, int x) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int[] a = {7, 1, 5, 2, 3, 6};
        int[] b = {3, 8, 6, 20, 7};
        int[] union = new int[a.length + b.length];
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (!exists(union, k, a[i])) {
                union[k++] = a[i];
            }
        }
        for (int i = 0; i < b.length; i++) {
            if (!exists(union, k, b[i])) {
                union[k++] = b[i];
            }
        }
        System.out.print("Union: ");
        for (int i = 0; i < k; i++) {
            System.out.print(union[i] + " ");
        }
    }
}