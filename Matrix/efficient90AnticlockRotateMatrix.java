public class efficient90AnticlockRotateMatrix {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                swap(mat,i,j);
            }
        }
        
        for(int i=0;i<n;i++){
            int low=0,high = n-1;
            while(low<high){
                swap2(low,high, i,mat);
                low++;
                high--;
            }
        }
    }
    
    static void swap(int mat[][],int i,int j){
        int tmp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = tmp;
    }
    
    static void swap2(int low , int high , int i, int mat[][]){
        int tmp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = tmp;
    }
}
