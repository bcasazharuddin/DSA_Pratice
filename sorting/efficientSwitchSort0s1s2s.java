public class efficientSwitchSort0s1s2s {
        public void sort012(int[] arr) {
            // code here
            int n = arr.length;
            int low = 0 , high = n-1 , mid = 0;
            while(mid <=high){
                switch(arr[mid]){
                case 0 : 
                    int tmp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = tmp;
                    low++;
                    mid++;
                    break;
                case 1 : 
                    mid++;
                    break;
                 case 2 : 
                    tmp = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = tmp;
                    high--;
                    break;
                }
            }
        }
}
