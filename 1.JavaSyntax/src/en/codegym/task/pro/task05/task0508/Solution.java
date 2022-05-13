package en.codegym.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Remove duplicate strings
*/

public class Solution {
    public static String[] strings;
    public static final int NUMBER_OF_STRINGS = 6;

    public static void main(String[] args) {
        //write your code here
        Scanner console = new Scanner(System.in);
        strings = new String[NUMBER_OF_STRINGS];
        for (int i = 0; i < strings.length && console.hasNext(); i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String currentString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (currentString == null) {
                    break;
                }
                if (currentString.equalsIgnoreCase(strings[j])){
                    strings[j] = null;
                    strings[i] = null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
