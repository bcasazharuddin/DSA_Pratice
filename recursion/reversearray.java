import java.util.Scanner;
public class reversearray{
    public static void reverseArray(int arr[],int start ,int end){
         if(start>=end){
            return ;
         }
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

      reverseArray(arr,start+1,end-1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Pls enter the size of number");
        int n = sc.nextInt(); 
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        reverseArray(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}