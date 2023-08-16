
import java.util.*;
import java.lang.*;
import java.io.*;

public class NaiveNegativeWindow {
    //{ Driver Code Starts
//Initial Template for Java

    public static void main(String[] args) throws IOException {
        BufferedReader br
                = new BufferedReader(new InputStreamReader(System.in));
        int t
                = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long a[] = new long[(int) (n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            int k = Integer.parseInt(br.readLine().trim());

            Compute obj = new Compute();
            long answer[] = obj.printFirstNegativeInteger(a, n, k);
            int sz = answer.length;

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < sz; i++) {
                output.append(answer[i] + " ");
            }
            System.out.println(output);

        }
    }
}

// } Driver Code Ends
//User function Template for Java
class Compute {

    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        long[] temp = new long[100];
        int index = 0;
        for (int i = 0; i + K - 1 < N; i++) {
            for (int j = 0; j < K; j++) {
                if (A[j + i] < 0) {
                    temp[index++] = A[j + i];
                    break;

                }
                if (j == K - 1) {
                    temp[index++] = 0;

                }
            }

        }
        long[] res = new long[index];
        for (int i = 0; i < index; i++) {
            res[i] = temp[i];
        }
        return res;
    }
}



             
                 
                              {
                  
            }                                                                                          
