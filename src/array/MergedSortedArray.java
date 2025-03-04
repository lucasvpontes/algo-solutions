package array;

import java.util.Arrays;
public class MergedSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2,3,0,0,0,0};
        int[] nums2 = new int[]{1,2,5,6};
        int[] nums3 = new int[nums1.length];
        int m = 2;
        int n = 4;

        int j = m-1;
        int k = n-1;
        int right = m + n -1;

        while (k >= 0) {
            if (j >= 0 && nums1[j] > nums2[k]) {
                nums1[right] = nums1[j--];
            }
            else {
                nums1[right] = nums2[k--];
            }

            right--;
        }

         System.out.println(Arrays.toString(nums1));
    }
}
