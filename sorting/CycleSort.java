public class CycleSort {
    // Online Java Compiler
// Use this editor to write, compile and run your Java code online
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[] = {20,40,50,10,30};
        int n = arr.length;
        cycleSortDistinct(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
    static void cycleSortDistinct(int arr[],int n){
        for(int cs=0;cs<n-1;cs++){
            int item = arr[cs];
            int pos = cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            int tmp = item;
            item = arr[pos];
            arr[pos] = tmp;
            while(pos != cs){
                 pos = cs;
            for(int i=cs+1;i<n;i++){
                if(arr[i]<item){
                    pos++;
                }
            }
            tmp = item;
            item = arr[pos];
            arr[pos] = tmp;
            }
        }
    }
}
