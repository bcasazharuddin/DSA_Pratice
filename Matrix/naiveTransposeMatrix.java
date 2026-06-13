public class naiveTransposeMatrix {
        static int n=4;
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        transpose(arr);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        
    }
        
    static void transpose(int mat[][]){
        int tmp[][] = new int[n][n];
        int R = mat.length;
        int C = mat[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                tmp[i][j] = mat[i][j];
            }
        }
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                mat[i][j] = tmp[i][j];
            }
        }
    }
}
