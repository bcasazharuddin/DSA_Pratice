import java.util.*;
public class naiveCountDisitinctDElementEveryWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        for(int i=0;i<=(n-k);i++){
            int count = 0;
            for(int j=0;j<k;j++){
                boolean flag = false;
                for(int p=0;p<j;p++){
                    if(arr[i+j] == arr[i+p]){
                        flag = true;
                        break;
                    }
                }
                if(flag == false){
                    count++;
                }
            }
            res.add(count);
        }
        return res;
    }
}