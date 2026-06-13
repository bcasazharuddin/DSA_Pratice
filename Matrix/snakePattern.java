import java.util.ArrayList;

public class snakePattern {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int R = matrix.length;

        for(int i=0;i<R;i++){
            if(i%2 == 0){
                for(int j=0;j<matrix[i].length;j++){
                    res.add(matrix[i][j]);
                }
            }else{
                for(int j=matrix[i].length-1;j>=0;j--){
                    res.add(matrix[i][j]);
                }
            }
        }
        
        return res;
    }
}
