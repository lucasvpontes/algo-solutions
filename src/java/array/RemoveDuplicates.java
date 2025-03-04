package array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new int[] {2,1,1}, 2));
    }

    public static int removeDuplicates(int[] nums, int val) {
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}
