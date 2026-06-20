package basics;

public class SecondSmallestElement {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8};
        System.out.println(secondSmallest(nums));
    }

    public static int secondSmallest(int[] nums){
        int smallest = nums[0];
        int secondSmallest = Integer.MAX_VALUE;
        for (int num : nums){
            if (num < smallest){
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        return secondSmallest;
    }
}
