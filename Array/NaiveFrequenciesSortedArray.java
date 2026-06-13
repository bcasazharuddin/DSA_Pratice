
import java.util.*;

public class NaiveFrequenciesSortedArray {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        frequency(arr, n);
    }

    public static void frequency(int arr[], int n) {
        int i = 1, freq = 1;
        while (i < n) {
            while (i < n && arr[i] == arr[i - 1]) {
                freq++;
                i++;
            }
            System.out.println(arr[i - 1] + " " + freq);
            freq = 1;
            i++;
        }
        if (n == 1 || arr[n - 1] != arr[n - 2]) {
            System.out.println(arr[i - 1] + " " + freq);
        }
    }
}
