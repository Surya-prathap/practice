package easyInterview;

public class FindLeaders {
    public static void main(String[] args) {
        int[] nums = {16,17,4,5,3,2};
        findLeaders(nums);
    }

    public static void findLeaders(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean leader = true;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] >= nums[i]){
                    leader = false;
                    break;
                }
            }
            if (leader){
                System.out.println(nums[i]);
            }
        }
    }
}
