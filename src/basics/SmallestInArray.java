package basics;

public class SmallestInArray {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,7,8};
        System.out.println(smallestElement(nums));
    }

    public static int smallestElement(int[] nums){
        int smallest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < smallest){
                smallest = nums[i];
            }
        }
        return smallest;
    }
}
