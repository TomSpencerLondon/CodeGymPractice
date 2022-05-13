package en.codegym.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Minimum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        //write your code here
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        array = new int[n];
        for (int j = 0; j < n; j++) {
            array[j] = Integer.parseInt(console.nextLine());
        }

        int min = Integer.MAX_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }

        System.out.println(min);
    }
}
