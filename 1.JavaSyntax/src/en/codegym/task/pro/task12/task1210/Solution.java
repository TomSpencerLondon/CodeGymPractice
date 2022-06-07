package en.codegym.task.pro.task12.task1210;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Flipping data
*/

public class Solution {
    public static ArrayList<Integer> numbers = new ArrayList<>();

    public static void main(String[] args) {
        init();
        print();

        reverse();
        print();
    }

    public static void init() {
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
    }

    public static void reverse() {
        Collections.reverse(numbers);
    }

    private static void print() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
