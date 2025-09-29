package javaCollections.programs;

import java.util.Arrays;

import static javaCollections.programs.BubbleSort.inputArray;

public class SelectionSort {
    static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i+1; j < n; ++j) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[7];
        //Input
        System.out.print("Enter numbers: ");
        inputArray(arr);

        selectionSort(arr);
        System.out.println("selection sort: "+ Arrays.toString(arr));
    }
}
