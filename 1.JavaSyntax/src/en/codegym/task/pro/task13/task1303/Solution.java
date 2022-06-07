package en.codegym.task.pro.task13.task1303;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* 
Displaying the elements of a set
*/

public class Solution {

    public static void print(HashSet<String> words) {
        //write your code here
        Iterator<String> iterator = words.iterator();

        while(iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Programming is usually taught using examples.".split(" ")));
        print(words);
    }
}
