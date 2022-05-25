package en.codegym.task.pro.task06.task0607;

/* 
Welcome! But not everyone.
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        signIn(console.nextLine());
    }

    public static void signIn(String username) {
        //write your code here
        if ("user".equalsIgnoreCase(username)) {
            return;
        }

        System.out.println("Welcome, " + username);
        System.out.println("We've really missed you, " + username);
    }
}
