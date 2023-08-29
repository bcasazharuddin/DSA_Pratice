class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        Arrays.fill(res , -1);
        

        int last = lastOccurrence(nums , target , 0  , nums.length-1);
     
        res[1] = last;
        return res;
    }

    static int lastOccurrence(int nums[], int target , int low , int high){
      
        if(low > high){
            return -1;
        }

        int mid = (low + high)/2 ;

        if(nums[mid] > target){
            return lastOccurrence(nums,target , low , mid-1);
        }
        else if(nums[mid]<target){
            return lastOccurrence(nums , target , mid+1, high);
        }
        else{
            if(mid == nums.length-1 || nums[mid] != nums[mid+1]){
                return mid ;
            }
            else{
                return lastOccurrence(nums,target , mid+1 , high);
            }
        }
    }
}