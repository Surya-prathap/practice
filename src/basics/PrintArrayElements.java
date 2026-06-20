package basics;

public class PrintArrayElements {
    public static void main(String[] args) {
        int[] nums = {2,3,4,5,6,7,8};
        printElements(nums);
    }

    public static void printElements(int[] nums){
        System.out.println("Array Elements are: ");
        for (int num : nums){
            System.out.print(num + " ");
        }
    }
}
