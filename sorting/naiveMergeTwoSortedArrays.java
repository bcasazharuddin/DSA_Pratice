import java.util.*;
public class naiveMergeTwoSortedArrays {
    public static void main(String[] args) {
        int a[] = {10,15,20};
        int b[] = {5,6,6,15};
        mergeArrays(a,b);
        System.out.println("Try programiz.pro");
    }
    public static void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        int c[] = new int[m+n];
        for(int i=0;i<n;i++){
            c[i] = a[i];
        }
        for(int j=0;j<n;j++){
            c[n+j] = b[j];
        }
        
        Arrays.sort(c);
        for(int i=0;i<m+n;i++){
            System.out.println(c[i]+" ");
        }
    }
}
