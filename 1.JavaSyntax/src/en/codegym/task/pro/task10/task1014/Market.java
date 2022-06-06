package en.codegym.task.pro.task10.task1014;

/* 
Buy 10 loaves of bread
*/

public class Market {
    private static boolean hasEggs = true;

    public static void main(String[] args) {
        boolean hasEggs = false;
        makePurchases(hasEggs);
    }

    public static void makePurchases(boolean hasEggs) {
        if (hasEggs) {
            System.out.println("10 loaves of bread purchased");
        } else {
            System.out.println("1 loaf of bread purchased");
        }
    }
}
