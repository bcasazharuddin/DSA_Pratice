import java.util.*;
public class efficientLongestCommonSpanSameSum {
    public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        int res = 0;
        int n = a1.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            temp[i] = a1[i] - a2[i];
        }
        
        HashMap<Integer,Integer> hm = new HashMap<>();
        
        int sum =0;
        for(int i=0;i<n;i++){
            sum +=temp[i];
            
            if(sum == 0){
                res = i+1;
            }
            
            if(!hm.containsKey(sum)){
                hm.put(sum,i);
            }
            
            if(hm.containsKey(sum)){
                res = Math.max(res,i-hm.get(sum));
            }
        }
        
        return res;
    }
}