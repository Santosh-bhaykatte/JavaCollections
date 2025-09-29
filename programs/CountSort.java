/*
Counting Sort is a non-comparison based sorting algorithm that works best when:
* The numbers are integers.
* The range of numbers (max value − min value) is not too large compared to the number of elements.

Instead of comparing elements (like Bubble, Merge, Quick sort), it counts the frequency of each number and then reconstructs the sorted array.

* Steps:
1. Find largest element in original array
2. Construct count array of size (largest+1)
3. Iterate through array & populate count array     [Indices of count array = Elements in original array]
4. Iterate count array & re-construct original array

* */

package javaCollections.programs;

import java.util.Arrays;
import java.util.Scanner;

import static javaCollections.programs.BubbleSort.inputArray;

public class CountSort {
    static void countSort(int[] arr) {
        //Find largest
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        //Construct count array of size (max+1)
        int[] countArr = new int[max+1];

        //Iterate arr & populate frequency of each element in countArr
        for (int i = 0; i < arr.length; ++i) {
            countArr[arr[i]]++;
        }
        /*
        for (int num : arr) {
            countArr[num]++;
        }
         */

        //Iterate countArr & re-construct arr
        int index = 0;
        for (int i = 0; i <= max; ++i) {
            while (countArr[i] > 0) {
                arr[index] = i;
                index++;
                countArr[i]--;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        //Input
        System.out.print("Enter numbers: ");
        inputArray(arr);

        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
