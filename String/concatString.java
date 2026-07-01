package String;

public class concatString {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        String s1 = "geeks";
        String s2 = s1;
        s1 = s1+"forgeeks";
        System.out.println(s1);
        System.out.println(s1 == s2);
    }
}