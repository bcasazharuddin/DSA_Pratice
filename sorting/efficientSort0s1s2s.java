public class efficientSort0s1s2s {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int low = 0 , high = n-1 , mid = 0;
        while(mid <=high){
            if(arr[mid] == 0){
                int tmp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = tmp;
                low++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int tmp = arr[high];
                arr[high] = arr[mid];
                arr[mid] = tmp;
                high--;
            }
        }
    }
}
