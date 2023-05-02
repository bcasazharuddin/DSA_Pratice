//{ Driver Code Starts
import java.lang.*;
import java.io.*;
import java.util.*;
class GFG
 {
	public static void main (String[] args) throws IOException
	 {
	 
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
        int t = Integer.parseInt(br.readLine()); 

        while(t-- > 0){
            int size = Integer.parseInt(br.readLine());
            String[] arrStr = ((String)br.readLine()).split("\\s+");
            int[] arr= new int[size];
            for(int i = 0;i<size;i++){
                arr[i] = Integer.parseInt(arrStr[i]);
            }
            System.out.println(new Solution().minJumps(arr));
        }
	 }
	 
}

// } Driver Code Ends


class Solution{
    static int minJumps(int[] arr){
        // your code here
        int max=0,jump=0,halt=0;
        if(arr[0]==0){
            return -1;
        }
        for(int i=0;i<arr.length-1;i++){
            max = Math.max(max,arr[i]+i);
            
            if(arr[i]==0){
            return -1;
         }
            if(max>=arr.length-1){
                jump+=1;
                return jump;
            }
            if(i==halt){
                halt=max;
                jump++;
            }
        }
        if(halt>=arr.length-1){
            return jump;
        }
        return -1;
        
    }
}