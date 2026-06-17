public class SumOfElements {
    public static void main(String[] args) {
        int[] nums = {2,4,5,6,7};
        System.out.println(sumOfElements(nums));
    }

    public static int sumOfElements(int[] nums){
        int sum = 0;
        for (int num : nums){
            sum += num;
        }
        return sum;
    }
}
