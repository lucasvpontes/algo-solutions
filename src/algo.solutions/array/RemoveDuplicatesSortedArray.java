package array;

import java.util.Arrays;
public class RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(removeDuplicates(new int[] {0,0,1,1,1,1,2,2,2,2,3,3})));
    }

    public static int[] removeDuplicates(int[] nums) {

        // Always condier edge cases
        if (nums.length <= 2) {
            return nums;
        }

        int k = 2;
        for(int i = 2; i< nums.length; i++){
            if (nums[i] != nums[k - 2]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return nums;
    }
}
