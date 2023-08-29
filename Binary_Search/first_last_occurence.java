class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[] = new int[2];
        Arrays.fill(res , -1);
        int first = firstOccurrence(nums, target , 0 , nums.length-1);
        res[0] = first;

        int last = lastOccurrence(nums , target , 0  , nums.length-1);
     
        res[1] = last;
        return res;
    }

    static int firstOccurrence(int nums[],int target , int low , int high ){
       
       while(low <= high){


           int mid =  (low + high)/2;

           if(nums[mid] > target){
              high = mid -1;
           }
           else if(nums[mid]  < target){
               low = mid + 1;
           }
           else{
               if(mid == 0 || nums[mid-1] != nums[mid]){
                   return mid;
               }else{
                   high = mid -1;
               }
           }
           
       }

       return -1;
      
           
        
    }

    static int lastOccurrence(int nums[], int target , int low , int high){
      
        while(low <= high){

        int mid = (low + high)/2 ;

        if(nums[mid] > target){
            high = mid -1 ; 
        }
        else if(nums[mid]<target){
            low = mid+1; 
        }
        else{
            if(mid == nums.length-1 || nums[mid] != nums[mid+1]){
                return mid ;
            }
            else{
                low = mid+1;
            }
        }
        }
        return -1;
    }
}