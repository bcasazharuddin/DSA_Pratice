public class mergeSort {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int n = 9;
        int l =0;
        int r=8;
        int a[] = new int[n];
        mergeSortArray(a,l,r);
    }
    public static mergeSortArray(int arr[],int l,int r){
        if(r>l){
            int m = l+(r-l)/2;
            mergeSortArray(arr,l,m);
            mergeSortArray(arr,m+1,r);
            mergeSortArray(arr,l,m,r);
        }
    }
}
