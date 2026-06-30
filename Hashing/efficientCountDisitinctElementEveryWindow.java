import java.util.*;
public class efficientCountDisitinctElementEveryWindow {
    ArrayList<Integer> countDistinct(int arr[], int k) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int n = arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<k;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        
        res.add(hm.size());
        
        for(int i=k;i<n;i++){
            hm.put(arr[i-k],hm.get(arr[i-k])-1);
            
            if(hm.get(arr[i-k]) == 0){
                hm.remove(arr[i-k]);
            }
            
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
            res.add(hm.size());
        }
        return res;
    }
}