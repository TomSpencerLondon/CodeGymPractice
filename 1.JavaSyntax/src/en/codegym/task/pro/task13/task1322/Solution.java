package en.codegym.task.pro.task13.task1322;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getShapeNameByCountOfCorners(3));
        System.out.println(getShapeNameByCountOfCorners(5));
        System.out.println(getShapeNameByCountOfCorners(1));
    }

    public static String getShapeNameByCountOfCorners(int countOfCorner) {
        switch (countOfCorner) {
            case 3:
                return "Triangle";
            case 4:
                return "Quadrangle";
            case 5:
                return "Pentagon";
            case 6:
                return "Hexagon";
            case 7:
                return "Heptagon";
            case 8:
                return "Octagon";
            default:
                return "Other shape";
        }
    }
}
