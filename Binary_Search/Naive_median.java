//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Driver
{
    public static void main(String args[]) 
	{ 
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int []a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            
            int  m= sc.nextInt();
            int []b = new int[m];
            for (int i = 0; i < m; i++) b[i] = sc.nextInt();
            
            double res = new GFG().medianOfArrays(n, m, a, b);
            
            if (res == (int)res) System.out.println ((int)res);
            else System.out.println (res);
        }
    		
	} 
}
// } Driver Code Ends


//User function Template for Java

class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        
        int temp[] = new int[n+m];
        
        int i=0;
        int j=0;
        int k=0;
        
        while(i<n && j<m){
            if(a[i] > b[j]){
                temp[k] = b[j];
                k++;
                j++;
                
            }else{
                   temp[k] = a[i];
                k++;
                i++; 
            }
        }
        
        while(i<n){
            temp[k] = a[i];
            i++;
            k++;
        }
        
        while(j<m){
            temp[k] = b[j];
            j++;
            k++;
        }
        
        Arrays.sort(temp);
        int nn = temp.length;
        //double sum =0;
        if(nn%2 != 0){
            int z=Math.round(nn/2);
            return  (double)temp[z];
        }
        else{
             int temp11 =temp[nn/2];
            int temp12 = temp[(nn/2)-1];
            return (double)(temp12 + temp11)/2;
            
        }
    }
}