package easyInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RearrangePositiveAndNegativeNumbers {
    public static void main(String[] args) {
        int[] nums = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(arrangePostivesAndNegatives(nums)));
    }

    public static int[] arrangePostivesAndNegatives(int[] nums){
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0){
                positives.add(nums[i]);
            }else {
                negatives.add(nums[i]);
            }
        }
        int pIndex = 0;
        int nIndex = 0;
        int rIndex = 0;
        while (pIndex < positives.size() && nIndex < negatives.size()){
            result[rIndex] = positives.get(pIndex);
            result[rIndex + 1] = negatives.get(nIndex);
            pIndex++;
            nIndex++;
            rIndex += 2;
        }
        return result;
    }
}
