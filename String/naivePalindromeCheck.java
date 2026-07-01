package String;

public class naivePalindromeCheck {
    boolean isPalindrome(String s) {
        // code here
        StringBuilder  rev = new StringBuilder(s);
        rev.reverse();
        return s.equals(rev.toString());
    }
}