package en.codegym.task.pro.task14.task1412;

/* 
Grouping exceptions
*/

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("The program runs from the start");
            Thread.sleep(1000);
            System.out.println("until lunch");
        } catch (NullPointerException | NumberFormatException e) {
            System.out.println("A letter-N exception occurred");
        } catch (IllegalArgumentException | IllegalStateException | InterruptedException e) {
            System.out.println("A letter-I exception occurred");
        } catch (ClassCastException e) {
            System.out.println("A letter-C exception occurred");
        }
    }
}
