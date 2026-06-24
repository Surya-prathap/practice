package hashSet;

import java.util.*;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,3,4};
        int[] arr2 = {3,3,4,5,6};
        System.out.println(intersectionOfArrays(arr1, arr2));
    }

    public static List<Integer> intersectionOfArrays(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int j = 0; j < arr2.length; j++) {
            if (set.contains(arr2[j])){
                list.add(arr2[j]);
            }
        }
        return list;
    }
}
