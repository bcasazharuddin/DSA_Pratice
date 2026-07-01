package String;

public class compareToFunction {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        String s1 = "geeksforgeeks";
        String s2 = "for";
        int res = s1.compareTo(s2);
        if(res == 0){
            System.out.println("same");
        }
        if(res > 0){
          System.out.println("s1 greater");
        }
        if(res < 0){
          System.out.println("s1 smaller");
        }
    }
}