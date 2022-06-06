package en.codegym.task.pro.task12.task1206;

/* 
Analyzing strings
*/

public class Solution {

    public static void main(String[] args) {
        String string = "I think this will be a new feature. " +
                "Just don't tell anyone that it was an accident.";

        System.out.println("Number of digits in the string: " + countDigits(string));
        System.out.println("Number of letters in the string: " + countLetters(string));
        System.out.println("Number of spaces in the string: " + countSpaces(string));
    }

    public static int countDigits(String string) {
        int countDigits = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isDigit(string.charAt(i))) {
                countDigits++;
            }
        }

        return countDigits;
    }

    public static int countLetters(String string) {
        //write your code here
        int countLetters = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isLetter(string.charAt(i))) {
                countLetters++;
            }
        }

        return countLetters;
    }

    public static int countSpaces(String string) {
        int countSpaces = 0;
        for (int i = 0; i < string.length(); i++) {
            if (Character.isSpaceChar(string.charAt(i))) {
                countSpaces++;
            }
        }

        return countSpaces;
    }
}
