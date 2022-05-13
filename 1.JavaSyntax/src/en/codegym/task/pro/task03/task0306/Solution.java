package en.codegym.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Triangle
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        //write your code here

        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b = console.nextInt();
        int c = console.nextInt();

        if ((a + b > c) && (a + c > b) && (c + b > a)) {
            System.out.println(TRIANGLE_EXISTS);
        }else {
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }
    }
}
