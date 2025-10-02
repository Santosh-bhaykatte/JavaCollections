package javaCollections.programs;

public class DiagonalSum {
    static int diagonalSum(int[][] arr) {
        int n = arr[0].length;
        int sumPrimary = 0, sumSecondary = 0;

        int i = 0;
        int j = n-1-i;
        while (i < n) {
            sumPrimary += arr[i][i];
            if (i == j) {
                --j;
                ++i;
                continue;
            }
            sumSecondary += arr[i][j];
            --j;
            ++i;
        }
        return sumPrimary + sumSecondary;
    }
    public static void main(String[] args) {
        int[][] arr = {
                {1, -2,  3, -4,  5},
                {6,  7, -8,  9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        System.out.println("Diagonal Sum = "+ diagonalSum(arr));
    }
}
