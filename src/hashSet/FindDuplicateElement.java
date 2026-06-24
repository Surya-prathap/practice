package hashSet;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicateElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,3,4,5};
        System.out.println(findDuplicate(nums));
    }

    public static int findDuplicate(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])){
                return nums[i];
            }
            set.add(nums[i]);
        }
        return -1;
    }
}
