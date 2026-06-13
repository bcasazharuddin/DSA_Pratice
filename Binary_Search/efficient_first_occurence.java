class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        Arrays.fill(res , -1);
        int first = firstOccurrence(nums, target , 0 , nums.length-1);
        res[0] = first;
        return res;
    }

    static int firstOccurrence(int nums[],int target , int low , int high){
         if(low > high){
             return -1;
         }
        int mid = (low + high) / 2;
       
        if(nums[mid] < target) {
            return firstOccurrence(nums ,target, mid+1 ,high );
        }
        else if(nums[mid] > target){
            return firstOccurrence(nums, target , low , mid -1);
        }
        else{

            if(mid == 0 || nums[mid-1] != nums[mid]){
                return mid;
            }
            else{
                return firstOccurrence(nums , target , low , mid-1);
            }

        }
      
           
        
    }
}