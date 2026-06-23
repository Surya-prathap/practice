package easyInterview;

public class MaximumSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaxSubarraySum(nums));
    }

    public static int findMaxSubarraySum(int[] nums){
//        Brute Force

//        int maxSum = nums[0];
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i; j < nums.length; j++) {
//                sum += nums[j];
//                maxSum = Math.max(sum, maxSum);
//            }
//        }
//        return maxSum;

//        Kadane's Algorithm

        int maxSum = nums[0];
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
