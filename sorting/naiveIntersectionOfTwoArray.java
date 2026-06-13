import java.util.Arrays;

class naiveIntersectionOfTwoArray {
    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m =nums2.length;
        int[] result = new int[Math.min(n, m)];
        int k=0;      
        for(int i=0;i<n;i++){
            //  check duplicate entry
            if(i>0 && nums1[i] == nums1[i-1]){
                continue;
            }
            // iterate array
            for(int j=0;j<m;j++){
                if(nums1[i] == nums2[j]){
                   result[k] = nums1[i];
                   k++;
                   break;
                }
            }
        }
         // return only filled elements
        return Arrays.copyOf(result, k);
    }
}