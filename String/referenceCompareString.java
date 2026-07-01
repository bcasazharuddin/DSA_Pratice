package String;

public class referenceCompareString {
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        String s1 = "geeks";
        String s2 = "geeks";
        if(s1 == s2){
            System.out.println("Yes");
        }else{
            System.out.println("No"); 
        }
        
        String s3 = new String("geeks");
        if(s1 == s3){
            System.out.println("Yes");
        }else{
            System.out.println("No"); 
        }
    }
}