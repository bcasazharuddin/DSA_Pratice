public class naiveQuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int p = high;
        int pi = partition(arr, low, high, p);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }

    private int partition(int[] arr, int low, int high, int p) {
        int temp[] = new int[high - low + 1];
        int index = 0;

        // smaller than pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] < arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        // equal to pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] == arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        int res = low + index - 1; // pivot ka final index

        // greater than pivot
        for (int i = low; i <= high; i++) {
            if (arr[i] > arr[p]) {
                temp[index] = arr[i];
                index++;
            }
        }

        // copy back to original array
        for (int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }

        return res;
    }
}
