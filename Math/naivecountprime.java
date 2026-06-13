class Solution {
    public int countPrimes(int n) {
        int res=0;
        if(n<=1){
            return 0;
        }
        for(int i=2;i<n;i++){
            if(prime(i)){
                res++;
            }
            
        }
        return res;
    }
    public static boolean prime(int num){
        
        if(num==2||  num==3){
           return true;
        }
        if(num%2==0 || num%3 ==0 ){
            return false;
        }
        for(int i=5;i*i<=num;i=i+6){
            if(num%i==0 || num%(i+2)==0){
                return false;
            }
        }
        return true;
    }
}