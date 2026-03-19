package Arrayz;

public class Negative {
    // Given an array print negative numbers only
    public void printNegative(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < 0) System.out.println(arr[i]);
        }
    }
}
