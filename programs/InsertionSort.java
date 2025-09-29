package javaCollections.programs;

import java.util.Arrays;

import static javaCollections.programs.BubbleSort.inputArray;

public class InsertionSort {
    static void insertionSort(int[] arr) {
        int n = arr.length;
        int j;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            for (j = i-1; j >= 0; j--) {
                if (arr[j] > key) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = key;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[7];
        //Input
        System.out.print("Enter numbers: ");
        inputArray(arr);

        insertionSort(arr);
        System.out.println("insertion sort: "+ Arrays.toString(arr));
    }
}
