package Java_DS_Algo;

import java.util.Scanner;

public class SidesOfTriangle {
    public static void main(String[] args) {
        /*
            Three magnitudes are entered through keyboard .
            Tell if they are sides of a triangle or not.
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        int a = sc.nextInt();
        System.out.print("Enter side 2: ");
        int b = sc.nextInt();
        System.out.print("Enter side 3: ");
        int c = sc.nextInt();

        if((a+b>c)&&(b+c>a)&&(a+c>b)) System.out.println("It is a valid triangle.");
        else System.out.println("Not a valid triangle");
    }
}
