package array;

import java.util.Map;
public class RomanToInt {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        final Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000
        );

        int sum = 0;
        int counter = 1;

        for(char c: s.toCharArray()) {
            int current = map.get(c);

            if (counter < s.length()) {
                int next = map.get(s.charAt(counter++));
                sum = next > current ? sum - current : sum + current;
            } else {
              sum = sum + current;
            }
        }

        return sum;
    }
}
