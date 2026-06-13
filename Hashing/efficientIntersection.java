import java.util.*;
class efficientInterection {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();
        HashSet<Integer> seen = new HashSet<>();
        int m = nums2.length;
        int res[] = new int[m];
        for(int s : nums1){
            hs.add(s);
        }
        int k=0;
        for(int i=0;i<m;i++){
            if(hs.contains(nums2[i]) && !seen.contains(nums2[i])) { // Modified
                res[k++] = nums2[i];
                seen.add(nums2[i]); // Added

            }
        }

         // Create final array of size k
        int[] ans = new int[k];

        for (int i = 0; i < k; i++) {
            ans[i] = res[i];
        }

        return ans;
        
    
    }
}