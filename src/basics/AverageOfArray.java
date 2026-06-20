package basics;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] nums = {2,4,6,8,3};
        System.out.println(averageOfElements(nums));
    }

    public static double averageOfElements(int[] nums){
        double sum = 0;
        for (double num : nums) sum += num;
        return sum / nums.length;
    }
}
