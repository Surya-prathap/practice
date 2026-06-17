import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,7,8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter target Element: ");
        int target = scanner.nextInt();
        linearSearch(nums,target);
    }

    public static void linearSearch(int[] nums, int target){
        for (int num : nums){
            if (num == target){
                System.out.println("Element Found");
                return;
            }
        }
        System.out.println("Element not Found");
    }

}
