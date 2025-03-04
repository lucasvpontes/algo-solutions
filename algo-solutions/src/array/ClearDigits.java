package array;

import java.util.HashMap;
import java.util.Map;
public class ClearDigits {
    public static void main(String[] args) {
        clearDigits("cb34");

        Map<String, Integer> map = Map.of("I", 1, "A", 2);
    }

    // My solution - 2ms
    public static String clearDigits(String s) {
        StringBuilder builder = new StringBuilder(s);
        for(int i = 0; i < builder.length(); i++) {
            if (Character.isDigit(builder.charAt(i))) {
                builder.delete(i-1, i+1);
                i=i-2;
            }
        }
        return builder.toString();
    }

    public String clearDigitsStack(String s) {
        StringBuilder stack = new StringBuilder();
        for(char c: s.toCharArray()) {
            if (Character.isDigit(c)) {
                if(stack.length() > 0) {
                    stack.deleteCharAt(stack.length() - 1);
                }
            } else {
                stack.append(c);
            }
        }
        return stack.toString();
    }
}
