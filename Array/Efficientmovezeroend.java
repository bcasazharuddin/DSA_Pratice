public class Efficientmovezeroend {
    
        public void moveZeroes(int[] arr) {
            int res = 0;
            for(int i=0;i<arr.length;i++){
                if(arr[i] !=0){
                 int temp = arr[res];
                 arr[res] = arr[i];
                 arr[i] = temp;
                 res++;
                }
            }
        }
    }

