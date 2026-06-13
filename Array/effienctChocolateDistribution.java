import java.util.ArrayList;
import java.util.Collections;

public class effienctChocolateDistribution {
    // User function Template for Java
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        int n = arr.size();
        // your code here
        if(m>n){
            return -1;
        }
        Collections.sort(arr);
        int res = arr.get(m-1)-arr.get(0);
        for(int i=1;(i+m-1)<n;i++){
            res = Math.min(res, (arr.get(i+m-1)-arr.get(i)));
            
        }
        return res;
    }
}
