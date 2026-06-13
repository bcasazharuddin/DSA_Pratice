import java.util.ArrayList;

public class boundaryTraversalMatrix {
    public ArrayList<Integer> boundaryTraversal(int mat[][]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int R = mat.length;
        int C = mat[0].length;
        if(R==1){
            for(int i=0;i<C;i++){
                res.add(mat[0][i]);
            }
        }else if(C==1){
             for(int i=0;i<R;i++){
                res.add(mat[i][0]);
            }
        }else{
            for(int i=0;i<C;i++){
                res.add(mat[0][i]);

            }
            
            for(int i=1;i<R;i++){
                res.add(mat[i][C-1]);

            }
            for(int i=C-2;i>=0;i--){
                res.add(mat[R-1][i]);

            }
            for(int i=R-2;i>=1;i--){
                res.add(mat[i][0]);

            }
            
        }
        return res;
    }
}

