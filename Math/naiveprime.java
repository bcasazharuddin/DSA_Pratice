class Solution {
    public int countPrimes(int n) {
         int res=0;
        if(n==1 || n==0){
            return 0;
        }
        for(int i=2;i<n;i++){
            if(prime(i)){
                res++;
            }
        }
        return res;
      }
    static boolean prime(int a){
       if(a==2 || a==3){
           return true;
       }

      for (int i = 2; i < a; i++){

            if (a % i == 0){
                return false;

            }
      }
 
        return true;
    } 
} 
