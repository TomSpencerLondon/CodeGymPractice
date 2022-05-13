package en.codegym.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Maximum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        //write your code here
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        array = new int[n];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(console.nextLine());
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println(max);
    }
}
