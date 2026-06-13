// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class mergeMergeSort {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int a[] = {10,15,20,40,8,11,55};
        int low = 0;
        int mid = 3;
        int high = 6;
        merge(a , low , mid , high);
System.out.println(Arrays.toString(a));
    }
    
    public static void merge(int a[],int low ,int mid , int high){
        int n1 = mid -low +1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++){
            left[i] = a[low+i];
        }
        for(int i=0;i<n2;i++){
            right[i] = a[mid+1+i];
        }
        int i=0,j=0,k=0;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                a[k] = left[i];
                i++;
                k++;
            }else{
                a[k] = right[j];
                k++;
                j++;
            }
        }
        while(i<n1){
            a[k] = left[i];
            i++;
            k++;
        }
        while(j<n2){
            a[k] = right[j];
            j++;
            k++;
        }
    }
}