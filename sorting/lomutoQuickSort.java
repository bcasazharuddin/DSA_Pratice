class lomutQuickSort {
    public void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;

        int p = high;
        int pi = lpartition(arr, low, high, p);

        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }

    private int lpartition(int[] arr, int low, int high, int p) {
        int pivot = arr[p];
        int i = low-1;
        for(int j=low;j<=high-1;j++){
            if(arr[j]< pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }
        int tmp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = tmp;
        
        return (i+1);
    }
}
