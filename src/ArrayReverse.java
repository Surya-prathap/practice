import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7};
        System.out.println(Arrays.toString(reverseArray(nums)));
    }

    public static int[] reverseArray(int[] nums){
        int[] reversedArray = new int[nums.length];
        int index = 0;
        for (int i = nums.length -1; i >= 0; i--) {
            reversedArray[index] = nums[i];
            index++;
        }
        return reversedArray;
    }
}
