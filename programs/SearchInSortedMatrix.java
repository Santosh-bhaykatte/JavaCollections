package javaCollections.programs;

public class SearchInSortedMatrix {
    static void searchInSortedMatrix1(int[][] arr, int n, int m, int key) {
        // O(n log n)
        for (int i = 0; i < n; ++i) {
            int start = 0;
            int end = m-1;

            while (start <= end) {
                int mid = (start+end)/2;
                if (key == arr[i][mid]) {
                    System.out.println("Found at index: ["+ i +","+ mid +"]");
                    return;
                } else if (key < arr[i][mid]) {
                    end = mid-1;
                } else {
                    start = mid+1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {
                {10, 20, 30, 40, 50},
                {15, 25, 35, 45, 51},
                {27, 29, 37, 48, 52},
                {32, 33, 39, 50, 53},
                {34, 35, 40, 54, 60}
        };
        searchInSortedMatrix1(arr, 5, 5, 54);
    }
}
