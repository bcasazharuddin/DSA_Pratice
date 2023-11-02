import java.util.*;
class MyCmp implements Comparator<Integer>{

    public int compare(Integer a, Integer b){
        return a%2 - b%2;
    }

}

class evennumberfirst{
    public static void main(String args[]){
        Integer arr[] = {5,20,10,3,13};

        Arrays.sort(arr, new MyCmp());

        System.out.println(Arrays.toString(arr));
    }
}