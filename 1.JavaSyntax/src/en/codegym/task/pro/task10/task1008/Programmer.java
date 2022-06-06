package en.codegym.task.pro.task10.task1008;

/* 
Salary
*/

public class Programmer {
    private int salary = 1000;

    //write your code here


    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary > this.salary) {
            this.salary = salary;
        }
    }
}
