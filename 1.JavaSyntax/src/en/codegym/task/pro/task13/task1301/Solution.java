package en.codegym.task.pro.task13.task1301;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

/* 
Processing a return
*/

public class Solution {
    public static void main(String[] args) {
        String[] array = {"In", "three", "years", "I", "will be a", "senior", "Java", "developer"};
        for (int i = 0; i < args.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for(String s : hashSet) {
            System.out.println(s);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(strings));
        return hashSet;
    }
}
