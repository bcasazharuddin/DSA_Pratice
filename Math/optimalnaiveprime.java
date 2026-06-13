class Solution {
    public int countPrimes(int n) {
       boolean primeArray[] = new boolean[n+1];
       Arrays.fill(primeArray,true);
       for(int i=2;i*i<=n;i++){
           if(primeArray[i]){
               for(int j=2*i;j<=n;j=j+i){
                   primeArray[j]= false;
               }
           }
       }
       int res=0;
       for(int i=2;i<n;i++){
         if(primeArray[i]){
             res++;
         }
       }
       return res;
    }
  
}