public class efficientTransposeMatrix {
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
    
    static void swap(int mat[][],int i,int j){
        int tmp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = tmp;
    }
    static void transpose(int mat[][]){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat,i,j);
            }
        }
    }
}
