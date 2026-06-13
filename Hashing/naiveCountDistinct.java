public class naiveCountDistinct {
    static int distinct(int arr[]) {
        // code here
        int n = arr.length;
        int res = 0;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                res++;
            }
        }
        
        return res;
    }
}