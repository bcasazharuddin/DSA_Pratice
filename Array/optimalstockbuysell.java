class Solution {
    public int maxProfit(int[] arr) {
        
        int max = 0;

        for(int i=1;i<arr.length;i++){
            if(arr[i]>arr[i-1]){
               max  += (arr[i]-arr[i-1]);
               
            

            }
        }
        return max;
       

    }

    
}