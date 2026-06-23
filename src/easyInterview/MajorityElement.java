package easyInterview;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,2,2,2,3,4,2};
        findMajorityElement(nums);
    }

    public static void findMajorityElement(int[] nums){
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > n/2){
                System.out.println("Majority Element: " + nums[i]);
                return;
            }
        }
    }
}
