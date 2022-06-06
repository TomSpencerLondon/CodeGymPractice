package en.codegym.task.pro.task12.task1207;

/* 
The lesser number
*/

public class Solution {
    public static void main(String[] args) {
        int first = 2;
        int second = 1;

        Boolean isLess = isLess(first, second);

        if (Boolean.TRUE.equals(isLess)) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The first number is greater than or equal to the second number.");
        }
    }

    public static Boolean isLess(int first, int second) {
        return first < second;
    }
}
