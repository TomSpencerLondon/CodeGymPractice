package en.codegym.task.pro.task11.task1109;

/* 
Objects of inner and nested classes
*/

public class Outer {
    class Inner {
        Inner() {
            System.out.println("Creating an object of an inner class");
        }
    }
    static class Nested {
        Nested() {
            System.out.println("Creating an object of a nested class");
        }
    }
}
