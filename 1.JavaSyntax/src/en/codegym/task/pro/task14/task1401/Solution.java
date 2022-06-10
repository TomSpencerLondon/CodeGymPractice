package en.codegym.task.pro.task14.task1401;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* 
Work as a handler
*/

public class Solution {

    public static final String INPUT_NAME = "\nEnter a name: ";
    public static final String INPUT_AGE = "Enter the age of user '%s': ";

    public static final String CANNOT_BE_NULL = "The name cannot be null.";
    public static final String CANNOT_BE_EMPTY = "The name cannot be empty.";
    public static final String CANNOT_CONTAIN_DIGIT = "The name cannot contain numbers.";
    public static final String CANNOT_BE_NEGATIVE = "The age cannot be less than 0.";
    public static final String CANNOT_BE_TOO_BIG = "The age cannot be greater than 150.";
    public static final String UNKNOWN_ERROR = "Unknown error.";

    public static final String FOUND = "\nUser '%s' not found at index %d.\n";
    public static final String NOT_FOUND = "\nUser '%s' not found.\n";

    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            addUser(new User());
        }

        User userToSearch = new User();
        userToSearch.setName("Raphael");

        findUserIndex(userToSearch);
    }

    static void addUser(User user) {
        System.out.print(INPUT_NAME);
        String name = scanner.nextLine();

        System.out.printf(INPUT_AGE, name);
        int age = Integer.parseInt(scanner.nextLine());

        int status = user.setName(name);
        if (status == -1) {
            System.out.println(CANNOT_BE_NULL);
        } else if (status == -2) {
            System.out.println(CANNOT_BE_EMPTY);
        } else if (status == -3) {
            System.out.println(CANNOT_CONTAIN_DIGIT);
        } else if (status != 0) {
            System.out.println(UNKNOWN_ERROR);
        }

        status = user.setAge(age);
        if (status == -1) {
            System.out.println(CANNOT_BE_NEGATIVE);
        } else if (status == -2) {
            System.out.println(CANNOT_BE_TOO_BIG);
        } else if (status != 0) {
            System.out.println(UNKNOWN_ERROR);
        }

        users.add(user);
    }

    static void findUserIndex(User user) {
        //write your code here
        int code = users.indexOf(user);
        if (code == -1) {
            System.out.printf(NOT_FOUND, user.getName());
        } else {
            System.out.printf(FOUND, user.getName(), users.indexOf(user));
        }

        System.out.printf(FOUND, user.getName(),code);
    }
}
