import java.util.Arrays; 
import java.util.Collections;
public class wrapperSorting{
    public static void main(String args[]){
        Integer arr[] = {5,20,10,2};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println(Arrays.toString(arr));
    }
}