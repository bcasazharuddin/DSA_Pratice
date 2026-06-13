class efficientkthsmallestElement{
    public int kthSmallest(int[] arr, int k) {
        // Code here
        int n = arr.length;
        int l=0,r=n-1;
        while(l<=r){
            int p = partiton(arr,l,r);
            if(p == k-1){
                return arr[p];
            }else if(p>k-1){
                r = p-1;
            }else{
                l = p+1;
            }
        }
        return -1;
    }
    
    public static int partiton(int arr[],int l, int h){
        int pivot = arr[h];
        int i = l-1;
        for(int j=l;j<=h;j++){
            if(arr[j]<pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp =arr[i+1];
        arr[i+1] = arr[h];
        arr[h] = temp;
        return (i+1);
    }
}
