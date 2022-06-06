package en.codegym.task.pro.task11.task1109;

/* 
Objects of inner and nested classes
*/

import en.codegym.task.pro.task11.task1109.Outer.Nested;

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Outer.Inner inner = new Outer().new Inner();
        Outer.Nested nested = new Nested();
    }
}
