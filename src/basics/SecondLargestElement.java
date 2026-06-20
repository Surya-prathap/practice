package basics;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {2,3,4,6,8,9,10};
        System.out.println(secondLargest(nums));
    }

    public static int secondLargest(int[] nums){
//        int max = nums[0];
//        int secondMax = nums[0];
//        for (int num : nums) {
//            if (num > max){
//                max = num;
//            }
//        }
//        for (int num : nums){
//            if (num > secondMax && num < max){
//                secondMax = num;
//            }
//        }
//        return secondMax;
        
        int max = nums[0];
        int secondMax = Integer.MIN_VALUE;
        
        for (int num : nums){
            if (num > max){
                secondMax = max;
                max = num;
            } else if (num > secondMax && num!= max) {
                secondMax = num;
            }
        }
        return secondMax;
    }
}
