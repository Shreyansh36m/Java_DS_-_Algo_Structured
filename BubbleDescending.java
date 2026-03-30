package Arrayz;

public class BubbleDescending {
    // Sort an array in descending order by bubble sort algorithm
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int swaps = 0;
            for (int j = 0; j < n-1; j++) {
                if(arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swaps++;
                }
                if (swaps == 0) break;
            }
        }
    }
}
