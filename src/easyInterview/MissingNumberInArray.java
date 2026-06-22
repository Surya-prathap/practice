package easyInterview;

public class MissingNumberInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,5};
        findMissing(nums);
    }

    public static void findMissing(int[] nums){
        for (int i = 1; i <= nums.length + 1; i++) {
            boolean found = false;
            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]){
                    found = true;
                }
            }
            if (!found){
                System.out.println("Missing Number: " + i);
                break;
            }
        }
    }
}
