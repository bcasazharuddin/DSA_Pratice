public class efficientColumnRowSearchMatrix {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int R = mat.length;
        int C = mat[0].length;
        int i=0, j=C-1;
        while(i<R && j>=0){
            if(mat[i][j]==x){
                return true;
            }else if(mat[i][j] > x){
                j--;
            }else{
                i++;
            }
            
        }
        return false;
    }
}
