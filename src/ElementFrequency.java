public class ElementFrequency {
    public static void main(String[] args) {
        int[] nums = {2,2,2,3,4,5,2,3,3,4};
        elementFrequency(nums);
    }

    public static void elementFrequency(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            boolean alreadyProcessed = false;
            for (int k = 0; k < i; k++) {
                if (nums[i] == nums[k]){
                    alreadyProcessed = true;
                    break;
                }
            }
            if (alreadyProcessed){
               continue;
            }
            int count = 1;
            for (int j = i + 1; j < nums.length; j++) {
               if (nums[i] == nums [j]){
                   count++;
               }
            }
            System.out.println(nums[i] + " --> " + count);
        }
    }
}
