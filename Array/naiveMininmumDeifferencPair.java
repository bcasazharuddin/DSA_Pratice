public class naiveMininmumDeifferencPair {
        public int minimumDifference(int[] arr) {
            // code here
            int res = Integer.MAX_VALUE;
            int n = arr.length;
            for(int i=1;i<n;i++){
                for(int j=0;j<i;j++){
                    res = Math.min(res , Math.abs(arr[i]-arr[j]));
                }
            }
            return res;
            
        }
}
