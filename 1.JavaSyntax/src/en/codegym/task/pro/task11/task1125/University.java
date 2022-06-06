package en.codegym.task.pro.task11.task1125;

/* 
Making a list of students
*/

public class University {
    private final String[] students = new String[30];

    public void addStudent(String student) {
        int i = 0;
        for (; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
        }
        students[i] = student;
    }

    public void printStudents() {
        for (String student : students) {
            if (student != null) {
                System.out.println(student);
            }
        }
    }

    public static void main(String[] args) {
        //write your code here
        University university = new University();
        university.addStudent("Max Feder");
        university.addStudent("Jose Hernandez");
        university.printStudents();
    }
}
