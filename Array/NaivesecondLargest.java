//{ Driver Code Starts
//Initial Template for Java

import java.io.*;

public class NaivesecondLargest {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().print2largest(arr, n);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends
//User function Template for Java
class Solution {

    int print2largest(int arr[], int n) {
        // code here
        int firstLargest = largest(arr, n);
        int second = -1;
        for (int i = 0; i < n; i++) {
            if (arr[firstLargest] != arr[i]) {
                if (second == -1) {
                    second = i;
                } else if (arr[i] > arr[second]) {
                    second = i;
                }
            }
        }

        return second == -1 ? -1 : arr[second];

    }

    static int largest(int arr[], int n) {
        int res = 0;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[res]) {
                res = i;
            }
        }

        return res;
    }
}
