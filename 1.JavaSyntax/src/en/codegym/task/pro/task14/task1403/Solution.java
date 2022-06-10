package en.codegym.task.pro.task14.task1403;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
Teaching assistant - 2
*/

public class Solution {

    public static final String PROMPT_STRING = "Enter a student number, or 'exit' to exit: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "The question will be answered by ";
    public static final String NOT_EXIST = "A student with this number does not exist";
    public static final String INTEGER_REQUIRED = "You must enter an integer";

    static List<String> studentsJournal = Arrays.asList(
            "Hugh Jass"
            , "Rita Booke"
            , "Justin Case"
            , "Robin Banks"
            , "Manny Kinn"
            , "Harry Pitts"
            , "Marty Graw"
            , "Shanda Lear"
            , "Rusty Dorr"
            , "Otto Graph");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }


            int studentId;
            try {
                studentId = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println(INTEGER_REQUIRED);
                continue;
            }

            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
