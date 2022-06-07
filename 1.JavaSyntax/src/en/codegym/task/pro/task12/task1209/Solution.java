package en.codegym.task.pro.task12.task1209;

import java.util.ArrayList;

/* 
Accounting department
*/

public class Solution {
    public static ArrayList<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();

    public static void initEmployees() {
        waitingEmployees.add("Doc");
        waitingEmployees.add("Grumpy");
        waitingEmployees.add("Happy");
        waitingEmployees.add("Sleepy");
        waitingEmployees.add("Bashful");
        waitingEmployees.add("Sneezy");
        waitingEmployees.add("Dopey");
    }

    public static void main(String[] args) {
        initEmployees();
    }

    public static void paySalary(String name) {
        //write your code here
        if (waitingEmployees.contains(name) && !alreadyGotSalaryEmployees.contains(name)) {
            alreadyGotSalaryEmployees.add(name);
            for (int i = 0; i < waitingEmployees.size(); i++) {
                if (waitingEmployees.get(i) != null && waitingEmployees.get(i).equals(name)) {
                    waitingEmployees.set(i, null);
                    break;
                }
            }
        }
    }
}
