package Arrayz;

public class ProductOfArray {
    public int product(int[] arr) {
        int n = arr.length;
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        return product;
    }
}
