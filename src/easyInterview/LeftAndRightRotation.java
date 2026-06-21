package easyInterview;

import java.util.Arrays;

public class LeftAndRightRotation {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 2;
        System.out.println("Left Rotation ---> " + Arrays.toString(leftRotation(nums,k)));
        System.out.println("Right Rotation ---> " +Arrays.toString(rightRotation(nums,k)));
    }

    public static int[] leftRotation(int[] arr, int k){
        int[] tempArray = arr.clone();
        swap(tempArray,0,k-1);
        swap(tempArray,k,tempArray.length -1 );
        return getReverseArray(tempArray);
    }

    public static int[] rightRotation(int[] arr, int k){
        int[] reversedArray = getReverseArray(arr);
        swap(reversedArray,0,k-1);
        swap(reversedArray,k,reversedArray.length - 1);
        return reversedArray;
    }

    public static int[] getReverseArray(int[] arr){
        int[] reversedArray = new int[arr.length];
        int index = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            reversedArray[index] = arr[i];
            index++;
        }
        return reversedArray;
    }

    public static void swap(int[] arr, int left, int right){
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
