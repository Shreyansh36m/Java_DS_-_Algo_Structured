package Arrayz;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        // Shallow copy
        int[] monkey = {0,1,2,3,6};
        int[] ape = monkey;
        ape[0] = 5;
        System.out.println(monkey[0]); // op = 5

        // Deep Copy
        int[] mouse = {0,5,8,9,12};
        int[] rat = Arrays.copyOf(mouse,mouse.length);
        rat[0] = 5;
        System.out.println(mouse[0]); // op = 0
    }
}
