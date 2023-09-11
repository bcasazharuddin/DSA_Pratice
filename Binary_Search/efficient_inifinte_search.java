import java.util.*;
class efficient_inifinte_search{

    static int searchVal(int arr[] ,int x){
        if(arr[0] == x){
            return 0;
        }

        int i=1;

        while(arr[i]< x){
            i = i*2;

        }
            if(arr[i] == x){
                return i;
            }

            return binary(arr , i/2+1 , i-1,x);
    }

  static int binary(int arr[], int low , int high , int k){
        if(low > high){
            return -1;
        }
        
        int mid = (low+high)/2;
        
        if(arr[mid]== k){
            return mid ;
            
        }
        else if(arr[mid] > k){
            return binary(arr , low , mid -1 , k);
        }
        else{
            return binary(arr , mid+1 , high , k); 
        }
    }



    public static void main(String args[]){

           System.out.print("please enter the size of array :");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        System.out.println("enter search value :");
        int x = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0; i<n;i++){
            arr[i] = i+1 ;
        }

       
    
        
     int res = searchVal(arr  , x);

    System.out.println("--- res---------"+ res);
    }
}