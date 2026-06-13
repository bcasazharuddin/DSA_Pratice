
import java.io.*;
import java.util.*;

public class efficientMaximumSubarray {
    //{ Driver Code Starts
//Initial Template for Java

    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int N = sc.nextInt();
            int K = sc.nextInt();
            ArrayList<Integer> Arr = new ArrayList<Integer>(N);

            // Appending new elements at 
            // the end of the list 
            for (int i = 0; i < N; i++) {
                int x = sc.nextInt();
                Arr.add(x);
            }

            Solution ob = new Solution();
            System.out.println(ob.maximumSumSubarray(K, Arr, N));
        }
    }
}

// } Driver Code Ends
//User function Template for Java
class Solution {

    static long maximumSumSubarray(int K, ArrayList<Integer> Arr, int N) {
        // code here
        long max = Integer.MIN_VALUE;
        int i = 0, j = 0;
        long sum = 0;

        while (j < N) {
            sum = sum + Arr.get(j);
            if (j - i + 1 < K) {
                j++;
            } else if (j - i + 1 == K) {
                max = Math.max(max, sum);
                sum = sum - Arr.get(i);
                i++;
                j++;
            }
        }
        return max;
    }
}

// 2nd method
int marksum(int arr[],int n,int k){
    int curr =0 ;
    for(int i=0;i<k;i++){
        curr += arr[i];
    }
    int res = curr;
    for(int i=k;i<n;i++){
        curr = curr + arr[i] - arr[i-k];
        res = Math.max(res,curr);
    }
    return res;
}
