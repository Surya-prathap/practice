package easyInterview;

import java.util.Arrays;

public class UnionOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7};
        int[] arr2 = {2,4,5,6,8,9};
        System.out.println(Arrays.toString(unionOfArrays(arr1, arr2)));
    }

    public static int[] unionOfArrays(int[] arr1, int[] arr2){
        int[] result = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while(i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                result[index] = arr1[i];
                index++;
                i++;
            } else if (arr1[i] > arr2[j]) {
                result[index] = arr2[j];
                index++;
                j++;
            } else {
                result[index] = arr1[i];
                index++;
                i++;
                j++;
            }
        }
        while (i < arr1.length){
            result[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length){
            result[index] = arr2[j];
            index++;
            j++;
        }
        int[] union = new int[index];
        for (int k = 0; k < index; k++) {
            union[k] = result[k];
        }
        return union;
    }
}
