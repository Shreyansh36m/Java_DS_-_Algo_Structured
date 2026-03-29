package Arrayz;

public class Sorted {
    // Check if the array is sorted (by default arrangement in ascending order is considered as sorted )
    public boolean sorted(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if(arr[i] <= arr[i-1]) return false;
        }
        return true;
    }
}
