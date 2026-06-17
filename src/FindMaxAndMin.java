public class FindMaxAndMin {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,8,9,10};
        findMaxAndMin(nums);
    }

    public static void findMaxAndMin(int[] nums){
        int maximum = nums[0];
        int minimum = nums[0];
        for (int num : nums){
            if (num > maximum){
                maximum = num;
            }
            if (num < minimum){
                minimum = num;
            }
        }
        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
    }
}
