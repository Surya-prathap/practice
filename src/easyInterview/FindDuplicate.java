package easyInterview;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,5,6};
        findDuplicate(nums);
    }

    public static void findDuplicate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    System.out.println("Duplicate: " + nums[i]);
                    return;
                }
            }
        }
    }
}
