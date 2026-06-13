
import java.io.*;

public class NaiveCheckSortedArray {
    //{ Driver Code Starts
// Initial Template for Java

    public static void main(String[] args) throws Exception {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            boolean ans = new Solution().arraySortedOrNot(arr, n);
            System.out.println(ans ? 1 : 0);
        }
    }
}

// } Driver Code Ends
// User function Template for Java
class Solution {

    boolean arraySortedOrNot(int[] arr, int n) {
        // code here
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
