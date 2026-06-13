class naiveFrequencyElement{
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        int arr[] = {10, 20, 10, 5, 20};
        int n = arr.length;
        for(int i=0;i<n;i++){
            boolean flag = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break; 
                }
            }
            if(flag == true){
                continue;
            }
            int freq = 1;
            for(int j=i+1;j<n;j++){
                if(arr[i] == arr[j]){
                  freq++;
                }
            }
            System.out.println("Arrays :"+arr[i]+" and frequency :"+freq);
        }
        
    }
}