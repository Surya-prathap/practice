package easyInterview;

public class FindPairsWithGivenSum {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 5;
        findPairs(nums, target);
    }

    public static void findPairs(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    System.out.println("(" + nums[i] + "," + nums[j] + ")");
                }
            }
        }
    }
}
