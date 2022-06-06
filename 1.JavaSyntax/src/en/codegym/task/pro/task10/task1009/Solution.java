package en.codegym.task.pro.task10.task1009;

/* 
Comparing strings
*/

public class Solution {

    public static void main(String[] args) {
        String s1 = new String("CodeGym");
        s1 = "CodeGym";
        String s2 = "CodeGym";
//        s2 = new String("CodeGym");
        String s3 = "CodeGym";
//        s3 = new String("CodeGym");
        System.out.println(s1 == s3);
        System.out.println(s2.equals(s3));
    }
}
