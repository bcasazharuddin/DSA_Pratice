public class naiveLongestCommonSpanSameSum {
    public int equalSumSpan(int[] a1, int[] a2) {
        // code here
        int res = 0;
        int n = a1.length;
        for(int i=0;i<n;i++){
            int sum1=0,sum2=0;
            for(int j=i;j<n;j++){
                sum1 += a1[j];
                sum2 += a2[j];
                if(sum1 == sum2){
                    res = Math.max(res , j-i+1);
                }
            }
        }
        
        return res;
    }
}