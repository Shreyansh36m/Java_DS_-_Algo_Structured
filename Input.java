package Arrayz;

import java.util.Scanner;

public class Input {
    // Input Array
    Scanner sc = new Scanner(System.in);
    public int[] arrayIn(){
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i = 0;i < size;i++){
            System.out.print("Enter element "+(i+1)+" ");
            int element = sc.nextInt();
            arr[i] = element;
        }
        return arr;
    }
}
