import java.util.Arrays;

public class efficientIntersectionOfTwoArray {

    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m =nums2.length;
        int[] result = new int[Math.min(n, m)];
        int k=0;  
        int i=0,j=0;  
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<n && j<m){
            if(i>0 && nums1[i] == nums1[i-1]){
                i++;
                continue;
            }
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
                result[k] = nums1[i];
                k++;
                i++;
                j++;
            }
        }  
        
        // return only filled elements
        return Arrays.copyOf(result, k);
    }
}
