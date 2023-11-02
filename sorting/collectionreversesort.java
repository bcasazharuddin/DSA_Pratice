import java.util.*;
class collectionreversesort{
    public static void main(String args[]){
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(5);
        list.add(20);
        Collections.sort(list);
        System.out.println("------ list-------------"+list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println("------- list1--------"+list);
    }
}