package basics;

import java.util.Arrays;

public class CopyArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(copyArray(nums)));
    }

    public static int[] copyArray(int[] nums){
        int[] copiedArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copiedArray[i] = nums[i];
        }
        return copiedArray;
    }
}
