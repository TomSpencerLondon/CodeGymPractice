package en.codegym.task.pro.task06.task0609;

/* 
A cubed cube calculator
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(ninthDegree(console.nextLong()));
    }

    public static long cube(long a) {
        return a * a * a;
    }

    //write your code here
    public static long ninthDegree(long number) {
        return cube(cube(number));
    }
}
