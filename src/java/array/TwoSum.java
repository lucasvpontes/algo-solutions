package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int j = target - nums[i];
            if (!map.isEmpty() && map.containsKey(j)) {
                System.out.println(Arrays.toString(new int[]{map.get(j), i}));
            }
            map.put(nums[i], i);
        }
        System.out.println(Arrays.toString(new int[]{}));
    }
}
