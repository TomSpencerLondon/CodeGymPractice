package en.codegym.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here

        Scanner console = new Scanner(System.in);
        int n = console.nextInt();
        int[] result;
        if (n > 0) {
            result = new int[n];

            for (int i = 0; i < result.length; i++) {
                result[i] = console.nextInt();
            }
            if (n % 2 != 0) {
                for (int i = 0; i < result.length; i++) {
                    System.out.println(result[i]);
                }
            }else {
                for (int i = result.length - 1; i >= 0; i--) {
                    System.out.println(result[i]);
                }
            }
        }


    }
}
