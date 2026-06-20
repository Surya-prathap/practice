package easyInterview;

import java.util.Arrays;

public class RotateArrayByKPositions {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int k = 3;
        System.out.println(Arrays.toString(rotateArray(nums, k)));
    }

    public static int[] rotateArray(int[] nums, int k) {
        int[] reversedArray = new int[nums.length];
        int index = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            reversedArray[index] = nums[i];
            index++;
        }
        swap(reversedArray, 0, k - 1);
        swap(reversedArray, k, nums.length - 1);
        return reversedArray;
    }

    public static void swap(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
