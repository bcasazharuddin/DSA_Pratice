//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().count(arr, n, x);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java



class Solution {
    int count(int[] arr, int n, int x) {
        // code here
        int count = 0;
         int first = firstOccurence(arr , 0 , n-1 , x);
         if(first == -1){
             return 0;
         }
          int last = lastOccurence(arr , 0 , n-1 , x);
         if(last == -1){
             return 0;
         }
         
         count = last - first + 1;
         
        return count;
    }
    
    
    int firstOccurence(int arr[], int low , int high , int x){
        
        if(low > high){
            return -1;
        }
        int mid = (low + high)/2 ;
        
        if(arr[mid] > x ){
            return firstOccurence(arr , low , mid-1 , x );
        }else if(arr[mid] < x){
            return  firstOccurence(arr , mid+1 ,high , x );
        }else{
            if(mid == 0 || arr[mid-1] != arr[mid] ){
                return mid;
            }else{
                return firstOccurence(arr , low ,mid-1 , x ); 
            }
        }
        
    }
    
     int lastOccurence(int arr[], int low , int high , int x){
         if(low > high){
             return -1 ; 
         }
        int mid = (low + high)/2 ;
        
        if(arr[mid] > x ){
            return lastOccurence(arr , low , mid-1 , x );
        }else if(arr[mid] < x){
            return  lastOccurence(arr , mid+1 ,high , x );
        }else{
            if(mid == arr.length -1 || arr[mid+1] != arr[mid] ){
                return mid;
            }else{
                return lastOccurence(arr , mid+1, high , x ); 
            }
        }
        
    }
}