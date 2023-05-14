public class EfficientConsecutive {
    
        public int findMaxConsecutiveOnes(int[] nums) {
           int count = 0;
           int res = 0;
    
           for(int i=0;i<nums.length;i++){
               if(nums[i]==1){
                   count++;
                   res = Math.max(count,res);
               }
               else{
                  count = 0;
               }
           }
           return res;
        }
    }

