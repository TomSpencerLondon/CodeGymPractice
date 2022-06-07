package en.codegym.task.pro.task12.task1221;

import java.util.ArrayList;

/* 
Generics and students
*/

public class Faculty {

    public static void main(String[] args) {
        var students = new ArrayList<Student>();
        students.add(new Student("Anthony"));
        students.add(new Student("Lanie"));

        printStudentNames(students);
    }

    public static void printStudentNames(ArrayList<Student> students) {
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getName());
        }
    }
}
