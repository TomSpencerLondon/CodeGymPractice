package en.codegym.task.pro.task14.task1406;

import java.util.Scanner;

/* 
Buy an elephant
*/

class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        buyElephant(null, scanner);
    }

    static void buyElephant(String answer, Scanner scanner) {
        if (answer == null) {
            System.out.println("Buy an elephant");
        } else if (answer.toLowerCase().equals("ok")) {
            System.out.println("That's better :) List of your excuses: ");
            throw new SecurityException();
        } else {
            System.out.println("Everyone says \"" + answer + "\", but you say to buy an elephant");
        }

        answer = scanner.nextLine();

        try {
            buyElephant(answer, scanner);
        } catch (Exception e) {
            System.out.println(answer);
            throw e;
        }
    }
}
