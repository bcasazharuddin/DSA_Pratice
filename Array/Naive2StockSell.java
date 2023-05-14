class Solution {
    public int maxProfit(int[] arr) {
       
       return  Profit(arr,0,arr.length-1);

    }

    static int Profit(int arr[],int start,int end){
        if(end<= start){
            return 0;
        }

        int profit = 0;

        for(int i=start ; i<end;i++){
            for(int j=i+1;j<=end;j++){
                if(arr[j]>arr[i]){
                    int curr_profit = arr[j] - arr[i] + Profit(arr,start,i-1)+Profit(arr,j+1,end);
                    profit  = Math.max(profit,curr_profit);
                }
            }
        }
        return profit;
    }
}
