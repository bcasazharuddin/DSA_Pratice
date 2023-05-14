class Solution {
    public int maxProfit(int[] arr) {
        int n = arr.length;
        int max = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               if(arr[j]>arr[i]){
                   max = Math.max(max,arr[j]-arr[i]);
               }
            }
        }

        return max;

    }
}
