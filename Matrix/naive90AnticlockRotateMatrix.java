public class naive90AnticlockRotateMatrix {
    public void rotateMatrix(int[][] mat) {
        // code here
        int n = mat.length;
        int tmp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tmp[n-j-1][i] = mat[i][j]; 
            }
        }
        
            for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = tmp[i][j]; 
            }
        }
    }
}
