package easyInterview;

import java.util.Arrays;

public class RotateArrayByOnePosition {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(rotateArray(nums)));
    }

    public static int[] rotateArray(int[] nums){
        int temp = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 1; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = temp;
        return nums;
    }
}
