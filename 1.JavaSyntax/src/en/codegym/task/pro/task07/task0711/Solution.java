package en.codegym.task.pro.task07.task0711;

import java.util.Arrays;

/* 
Filling an array flexibly
*/

public class Solution {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        fillArray(array, 3, 1, 3);
        System.out.println(Arrays.toString(array));
    }

    public static void fillArray(Integer[] array, int value, int begin, int end) {
        //write your code here
        for (int i = begin; i < end; i++) {
            array[i] = value;
        }
    }
}
