package array;

import java.util.Arrays;
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int val = 2;
        int k = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
            if (i == nums.length-1 && nums[nums.length-1] == val) {
                nums[i] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
        System.out.println(k);
    }
}
