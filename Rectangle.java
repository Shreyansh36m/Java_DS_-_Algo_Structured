package Java_DS_Algo;

import java.util.Scanner;

public class Rectangle {
    /*
        Take length and breadth of rectangle and check if its area is greater than
        its perimeter or not .
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int length = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int breadth = sc.nextInt();

        int area = length*breadth;
        int perimeter = 2*(length+breadth);

        if(area > perimeter) {
            System.out.println("Area is greater than perimeter!");
        } else if (area == perimeter) {
            System.out.println("Both are equal.");
        }
        else if (perimeter> area){
            System.out.println("Perimeter is greater than area.");
        }
        else {
            System.out.println("Something else!");
        }
    }
}
