package en.codegym.task.pro.task13.task1318;

/* 
Next month, please
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getNextMonth(Month.JANUARY));
        System.out.println(getNextMonth(Month.JULY));
    }

    public static Month getNextMonth(Month month) {
        //write your code here
        int ordinal = month == Month.DECEMBER ? 0 : month.ordinal() + 1;
        return Month.values()[ordinal];
    }
}
