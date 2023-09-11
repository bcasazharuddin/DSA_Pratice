import java.util.*;

class naive_search_infinite_array{
 static int searchVal(int arr[]  ,int x){
      int i=1;

      if(arr[0] == x){
        return 0;
      }
      while(true){
        if(arr[i] == x){
            return i;
        }
        else if(arr[i] > x){
        return -1;
       }
         i++;
      }
//    System.out.print("-------- serachVal---------");
    //  return -1;
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

