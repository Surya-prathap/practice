package easyInterview;

import java.util.Arrays;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3,5,6,7,8};
        int[] arr2 = {1,5,7,8,9};
        System.out.println(Arrays.toString(intersectionOfArrays(arr1, arr2)));
    }

    public static int[] intersectionOfArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < arr1.length && j < arr2.length){
            if (arr1[i] < arr2[j]){
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            }else {
                result[index] = arr1[i];
                index++;
                i++;
                j++;
            }
        }
        int[] intersection = new int[index];
        for (int k = 0; k < index; k++) {
            intersection[k] = result[k];
        }
        return intersection;
    }
}
