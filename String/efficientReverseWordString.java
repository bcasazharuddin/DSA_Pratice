package String;

public class efficientReverseWordString {
    public String reverseWords(String s) {
        // Remove leading, trailing and extra spaces
        s = removeExtraSpaces(s);
        int n = s.length();
        char[] str = s.toCharArray();
        reverseWord(str,n);
        return new String(str);
    }
    public static String removeExtraSpaces(String s) {
    StringBuilder sb = new StringBuilder();

    for (String word : s.trim().split("\\s+")) {
        sb.append(word).append(" ");
    }

    return sb.toString().trim();
    }
    public static void reverseWord(char str[],int n){
        int start = 0;
        for(int end=0;end<n;end++){
            if(str[end] == ' '){
                reverse(str,start,end-1);
                start = end+1;
            }
        }

        reverse(str,start,n-1);
        reverse(str,0,n-1);
    }
    public static void reverse(char str[], int low , int high){
        while(low <= high){
            char temp = str[low];
            str[low] = str[high];
            str[high] = temp;
            low++;
            high--;
        }
    }
}