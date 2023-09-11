class Solution {
    public int search(int[] nums, int target) {

        // int result = binary(nums , 0 , nums.length-1 , target);

        int low = 0 , high = nums.length -1 ;
        while(low <= high){
            int mid = (low+high)/2;

            if(nums[mid]==target){
                return mid;

            }
            if(nums[low] <= nums[mid]){
                if(target >= nums[low] && target < nums[mid]){
                    high = mid-1;
                }else{
                    low = mid+1;
                }
            }else{
                 if(target > nums[mid] && target <= nums[high]){
                    low = mid+1;
                }else{
                    high = mid-1;
                }
            }
        }

        return -1;
    }

    // static int binary(int nums[],int low , int high , int target){

    //     if(low > high){
    //         return -1;
    //     }

    //     int mid = (low+high)/2 ;

    //     if(nums[mid] == target){
    //         return mid;
    //     }
    //     else if(nums[low] < nums[mid]){
    //         if(target>= nums[low] && nums[mid]>target){
              
    //             return binary(nums, low ,mid-1, target);
    //         }
    //         else{
            

    //              return binary(nums, mid+1 ,high, target);
    //         }

    //     }
    //   else{
    //          if(target> nums[mid] && nums[high]>=target){
    //            return binary(nums, mid+1 ,high, target);
    //         }
    //         else{
    //             return binary(nums, low ,mid-1, target);
    //         }

    //   }
    // }


}