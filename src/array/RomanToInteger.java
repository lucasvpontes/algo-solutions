package array;

import java.util.Map;
public class RomanToInteger {

    public static void main(String[] args) {
        System.out.println(romanToInt("XXIV"));
    }

    public static int romanToInt(String s) {
        Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int result = 0;

        for(int i = 0; i < s.length()-1; i++) {
            int after = map.get(s.charAt(i+1));
            int current = map.get(s.charAt(i));
            result = after > current ? result - current : result + current;
        }

        result += map.get(s.charAt(s.length() - 1));

        return result;
    }
}
