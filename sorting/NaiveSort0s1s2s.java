public class NaiveSort0s1s2s {
    public void sort012(int[] arr) {
        // code here
        int n = arr.length;
        int[] temp = new int[n];
        int i=0;
        for(int j=0;j<n;j++){
            if(arr[j] == 0){
                temp[i++] = arr[j];
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j] == 1){
                temp[i++] = arr[j];
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j] == 2){
                temp[i++] = arr[j];
            }
        }
        
        for(int j=0;j<n;j++){
                arr[j] = temp[j];
        }
    }
}
