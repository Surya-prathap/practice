package hashSet;

import java.util.HashSet;
import java.util.Set;

public class FindUniqueElement {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,4,1};
        System.out.println(findUnique(nums));
    }

    public static int findUnique(int[] nums){
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                set.remove(nums[i]);
            } else {
                set.add(nums[i]);
            }
        }
        for (int num : set){
            return num;
        }
        return -1;
    }
}
