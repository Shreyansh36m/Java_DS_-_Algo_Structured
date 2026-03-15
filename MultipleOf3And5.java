package Java_DS_Algo;

import java.util.Scanner;

public class MultipleOf3And5 {
    /*
    Check if a number is divisible by 5 and 3 or not
    -> If divisible by 5 and not 3 say so
    -> If divisible by 3 and not 5 say so
    -> If divisible by both , report same
    -> If not divisible by both , report same
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        if(num%15==0){
            System.out.println(num+" is divisible by both 3 & 5.");
        } else if (num%5==0) {
            System.out.println(num+" is only divisible by 5.");
        } else if (num%3==0) {
            System.out.println(num+" is only divisible by 3.");
        } else {
            System.out.println("Different multiple...");
        }
    }
}
