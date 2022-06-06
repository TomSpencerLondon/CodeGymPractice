package en.codegym.task.pro.task12.task1204;

/* 
Paying bills
*/

public class Solution {
    public static Integer balance = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String bill = "1234567890";

        System.out.println("Current balance: " + balance);
        processPayment(bill);
        System.out.println("Current balance: " + balance);
    }

    public static void processPayment(String bill) {
        //write your code here
        balance -= Integer.parseInt(bill);
    }
}
