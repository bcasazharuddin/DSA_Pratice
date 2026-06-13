public class naiveSelectionSort {
    void selectionSort(int[] arr) {
            // code here
            int n = arr.length;
            int temp[] = new int[n];
            for(int i=0;i<n;i++){
                int min_idx = 0;
                for(int j=1;j<n;j++){
                    if(arr[j] < arr[min_idx]){
                        min_idx = j;
                    }
                }
                temp[i]  = arr[min_idx];
                arr[min_idx] = Integer.MAX_VALUE;
            }
            
            for(int i=0;i<n;i++){
                arr[i] = temp[i];
            }
        }
}
