import java.util.*;
public class efficientPairwithgivenSum {
    boolean twoSum(int arr[], int target) {
        // code here
        Set<Integer> s = new HashSet<>();
        for(int x : arr){
            if(s.contains(target-x)){
                return true;
            }else{
                s.add(x);
            }
        }
        
        return false;
    }
}