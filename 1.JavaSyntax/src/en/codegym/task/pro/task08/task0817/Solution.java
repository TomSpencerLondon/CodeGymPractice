package en.codegym.task.pro.task08.task0817;

/* 
Increments
*/

public class Solution {

    public static void main(String[] args) {
        int a = 3;
        int b = ++a + (a-- * ++a);

        System.out.println(b);
    }
}