public class IsArraySorted {
    public static void main(String[] args) {
        int[] nums = {2,3,3,4,6,7,8};
        if (isArraySorted(nums)){
            System.out.println("Sorted");
        }else{
            System.out.println("Not Sorted");
        }
    }

    public static boolean isArraySorted(int[] nums){
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]){
                return false;
            }
        }
        return true;
    }
}
