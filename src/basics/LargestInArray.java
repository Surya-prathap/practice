package basics;

public class LargestInArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,7,8};
        System.out.println(largestElement(nums));
    }

    public static int largestElement(int[] nums){
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest){
                largest = nums[i];
            }
        }
        return largest;
    }
}
