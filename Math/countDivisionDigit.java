//{ Driver Code Starts
//Initial Template for Java
//******************************************************************************************
 // Ques : Given a number N. Count the number of digits in N which evenly divides N.
//*****************************************************************************************************
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            int N = Integer.parseInt(read.readLine());
            Solution ob = new Solution();
            System.out.println(ob.evenlyDivides(N));
        }
    }
}
// } Driver Code Ends


//User function Template for Java


class Solution{
    static int evenlyDivides(int N){
        
        int count =0;
        // if(N%0==0){
        //     return 1;
        // }
        int temp = N;
        while(temp>0){
           
            int res = temp%10;
            if( res>0 && N%res == 0){
                count++;
            }
        temp = temp/10;
            
        }
        return count;
        // code here
    }
}