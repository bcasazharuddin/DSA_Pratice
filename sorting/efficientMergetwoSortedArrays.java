// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
public class efficientMergetwoSortedArrays {
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
        int i=0 , j=0;
        while(i<n && j<m){
            if(a[i] <=b[j]){
                System.out.print(a[i]+" ");
                i++;
            }else{
                System.out.print(b[j]+" ");
                j++; 
            }
        }
        while(i<n){
            System.out.print(a[i]+" ");
            i++;
        }
        while(j<m){
            System.out.print(b[j]+" ");
                j++; 
        }
    }
}
