package basics;

public class IsArraySorted {
    public static void main(String[] args) {
        int[] nums = {2, 3, 3, 4, 6, 7, 8};
        int[] nums2 = {8,6,4,2};
        int[] nums3 = {3,4,5,2};
        System.out.println(isSorted(nums));
        System.out.println(isSorted(nums2));
        System.out.println(isSorted(nums3));
    }

//    public static boolean isArraySorted(int[] nums) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] > nums[i + 1]) {
//                return false;
//            }
//        }
//        return true;
//    }


    public static String isSorted(int[] nums) {
        boolean ascending = true;
        boolean descending = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                ascending = false;
            }
            if (nums[i] < nums[i + 1]) {
                descending = false;
            }
        }
        if (ascending) {
            return "Sorted in Ascending order";
        } else if (descending) {
            return "Sorted in Descending order";
        } else {
            return "Not Sorted";
        }
    }
}
