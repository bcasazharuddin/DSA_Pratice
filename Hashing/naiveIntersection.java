class naiveIntersection {
    public int[] intersection(int[] nums1, int[] nums2) {
       int n = nums1.length;
       int m = nums2.length;
       int res[] = new int[n];
       int k=0;
       for(int i=0;i<n;i++){
          boolean flag = false;
          boolean alreadyCheck = false;
        // Check duplicate in result
        for (int x = 0; x < k; x++) {
            if (res[x] == nums1[i]) {
                alreadyCheck = true;
                break;
            }
        }

        if (alreadyCheck) {
            continue;
        }
        for(int j=0;j<m;j++){
            if(nums1[i] == nums2[j]){
                flag = true;
                alreadyCheck = true;
                break;
            }
        }

        if(flag){
            res[k++] = nums1[i];
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