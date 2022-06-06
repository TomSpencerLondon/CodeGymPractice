package en.codegym.task.pro.task11.task1104;

/* 
String converter
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        //write your code here
        double amount = Double.parseDouble(string);

        System.out.println(Math.round(amount));
    }
}
