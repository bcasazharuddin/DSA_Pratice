public record HoareQuickSort() {
    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int p = low;
        int pi = hpartition(arr, low, high, p);

        quickSort(arr, low, pi);
        quickSort(arr, pi + 1, high);
    }

    private int hpartition(int[] arr, int low, int high, int p) {
        int pivot = arr[low];
        int i = low -1;
        int j = high+1;
        while(true){
            do{
                i++;
            }while(arr[i] < pivot);
            do{
                j--;
            }while(arr[j] > pivot);
            if(i>=j) return j;
            int tmp = arr[i];
            arr[i]  = arr[j];
            arr[j] = tmp;
        }
    }

}
