package en.codegym.task.pro.task09.task0917;

/* 
String pool
*/

public class Solution {
    public static void main(String[] args) {
        String first = new String("CodeGym");
        String second = new String("CodeGym");
        String third = new String("codegym");
        System.out.println(equal(first, second));
        System.out.println(equal(second, third));
    }

    public static boolean equal(String first, String second) {
        return first.intern() == second.intern();
    }
}
