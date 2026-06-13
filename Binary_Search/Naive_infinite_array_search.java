import java.util.*;

class InfinteSerach{
    public static void main(String args[]){

        System.out.print("please enter the size of array :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("enter search value :");
        int x = sc.nextInt();

        int arr[] = new int[n];

        for(int i=1; i<=n;i++){
            arr[i] = i ;
        }
     int res = search(arr , n , x);

    System.out.println("--- res---------", res);
    }

    static int search(int arr[] , int n ,int x){
      int i=0;
      while(true){
        if(arr[i]==x){
            return i;
        }
       if(arr[i]> x){
        return -1;
       }
        i = i++;
      }

     
    }
}