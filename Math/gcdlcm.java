//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S[] = read.readLine().split(" ");
            Long A = Long.parseLong(S[0]);
            Long B = Long.parseLong(S[1]);

            Solution ob = new Solution();
            Long[] ptr = ob.lcmAndGcd(A,B);
            
            System.out.print(ptr[0]);
            System.out.print(" ");
            System.out.println(ptr[1]);
        }
    }
}
// } Driver Code Ends


class Solution {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
    
        // Long lcm = A*B/gcd(A,B);
        // Long arr[] = new Long[2];
        // arr[0] = lcm;
        // arr[1] = gcd(A,B);
        // return new Long[]{lcm,gcd(A,B)};`
        return new Long[]{lcm(A,B),gcd(A,B)};
    }
    
    static Long  gcd(Long A,Long B){
        // if(A==0){
        //     return B;
        // }
        // return gcd(B%A,A);
        // Long x = Math.min(A,B);
        // while(x>0){
        //     if(A%x== 0 && B%x==0){
        //     break;}
        //     x--;
        // }
        // return x;
        while(A!=B){
            if(A>B){
                A=A-B;
            }
            else{
                B=B-A;
            }
        }
        return A;
         
    }
    static Long lcm(Long A,Long B){
        Long x=Math.max(A,B);
        while(true){
            if(x%A==0 && x%B==0){
            break;}
             x++;
        }
        return x;
    }
    
}