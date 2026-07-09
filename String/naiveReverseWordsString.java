package String;
import java.util.*;
public class naiveReverseWordsString {
    public String reverseWords(String s) {
        s = s.trim();
        Stack<String> st = new Stack<>();
        // Split by one or more spaces
        String[] words = s.split("\\s+");
        // Push all words into stack
        for(String word : words){
            st.push(word);
        }
        // Pop words to get them in reverse order
        StringBuilder result = new StringBuilder();
        while(!st.isEmpty()){
            result.append(st.pop());
            if (!st.isEmpty()) {
                result.append(" ");
            }
        }


        return result.toString();
    }
}