package easyInterview;

public class FindUnique {
    public static void main(String[] args) {
        int[] nums = {1,1,2,3,6,5,2,4,6,3,4};
        findUnique(nums);
    }

    public static void findUnique(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]){
                    count++;
                }
            }
            if (count == 1){
                System.out.println("Unique Element: " + nums[i]);
            }
        }
    }
}
