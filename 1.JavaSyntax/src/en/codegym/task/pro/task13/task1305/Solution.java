package en.codegym.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Iterator;

/* 
Find and neutralize
*/

public class Solution {
    public static String bug = "bug";

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithFor(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        //write your code here
        for (int i = 0; i < list.size(); i++) {
            String string = list.get(i);
            if (bug.equalsIgnoreCase(string)) {
                list.remove(string);
                i--;
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        //write your code here
        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            String next = iterator.next();
            if (bug.equalsIgnoreCase(next)) {
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        //write your code here
        ArrayList<String> copy = new ArrayList<>(list);
        for (String word : copy) {
            if (bug.equalsIgnoreCase(word)) {
                list.remove(word);
            }
        }
    }
}
