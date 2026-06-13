class Solution
{
    //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] nums, int n, int k) 
    {
        // You
        
        int i =0 , j= 0;
        // int n  = nums.length;
        int sum = 0;
        // int countSubarray = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        // System.out.println(n);
        
        while(j<n){
          
            sum = sum + nums[j];

            if(sum < k){
                j++;
            }
            else if(sum == k){
                // countSubarray++;
                ans.add(i+1);
                j++;
            }
            else if(sum > k){

                while(sum>k){
                  
                    sum = sum - nums[i];
                    i++;
                if(sum == k){
                  ans.add(i+1);  
                }
                }
                j++;
             
            }
        
        }
        return ans;
    }
}