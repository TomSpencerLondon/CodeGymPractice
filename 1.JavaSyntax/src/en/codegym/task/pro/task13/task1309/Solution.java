package en.codegym.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Student performance
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //write your code here
        grades.put("John Davis", 91.5);
        grades.put("Harry Willis", 34.7);
        grades.put("Don Mary", 66.5);
        grades.put("Ron Harrison", 84.7);
        grades.put("Dee Ruhal", 71.4);
    }
}
