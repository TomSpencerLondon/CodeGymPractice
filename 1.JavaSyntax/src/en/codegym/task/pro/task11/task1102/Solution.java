package en.codegym.task.pro.task11.task1102;

/* 
Technical specification: Earth
*/

public class Solution {

    public static void main(String[] args) {
        Planet earth = new Planet();
        earth.name = "Earth";
        earth.age = 4_540_000_000L;
        earth.speed = 170_218;
        earth.area = 510_072_000;
        earth.printInformation();
    }
}
