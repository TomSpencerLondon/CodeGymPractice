package en.codegym.task.pro.task08.task0812;

/* 
A new kind of swap
*/

public class Solution {
    public static void main(String[] args) {
        /* Expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
