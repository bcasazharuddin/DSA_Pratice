public class naivecolumnRowSerachMatrix {
    public static boolean matSearch(int mat[][], int x) {
        // your code here
        int R = mat.length;
        int C = mat[0].length;
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(mat[i][j]==x){
                    return true;
                }
            }
        }
        return false;
    }
}
