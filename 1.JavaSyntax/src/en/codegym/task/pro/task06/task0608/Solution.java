package en.codegym.task.pro.task06.task0608;

/* 
A cube calculator
*/

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println(cube(console.nextLong()));
    }

    //write your code here
    public static long cube(long value) {
        return (long) Math.pow((double) value, 3);
    }
}
