public class heapSort {    
        public void buildheap(int arr[],int n){
            for(int i=(n/2)-1;i>=0;i--){
                heapify(arr, n , i);
            }
        }// Function to sort an array using Heap Sort.
        public void heapSort(int arr[]) {
            // code here
            int n = arr.length;
            buildheap(arr,n);
            for(int i=n-1;i>0;i--){
                int temp = arr[0];
                arr[0] = arr[i];
                arr[i] = temp;
                heapify(arr,i,0);
            }
        }
        
        void heapify(int arr[],int n ,int i){
            int largest = i;
            int l = 2*i+1;
            int r = 2*i+2;
            if(l<n && arr[l]>arr[largest]){
                largest = l;
            }
            if(r<n && arr[r]>arr[largest]){
                largest = r;
            }
            
            if(largest != i){
                int swap = arr[i];
                arr[i] = arr[largest];
                arr[largest] = swap;
                heapify(arr,n, largest);
            }
        }
}
