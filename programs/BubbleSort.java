package javaCollections.programs;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n-i-1; ++j) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];

        //Input
        System.out.print("Enter numbers: ");
        for (int i = 0; i < arr.length; ++i) {
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.println("bubble sort: "+ Arrays.toString(arr));
    }
}
