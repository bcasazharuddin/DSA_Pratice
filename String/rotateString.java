package String;

public class rotateString {
    public boolean rotateString1(String s, String goal) {
        if(s.length() != goal.length()){
            return false;
        }

        String temp = s + s;
        return temp.indexOf(goal) != -1;
    }
}
