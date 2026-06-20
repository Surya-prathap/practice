import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,4,6,7,8,8,8};
        System.out.println(Arrays.toString(removeDuplicates(nums)));
    }

    public static int[] removeDuplicates(int[] nums){
        int uniqueIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[uniqueIndex]){
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        int[] result = new int[uniqueIndex + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = nums[i];
        }
        return result;
    }
}
