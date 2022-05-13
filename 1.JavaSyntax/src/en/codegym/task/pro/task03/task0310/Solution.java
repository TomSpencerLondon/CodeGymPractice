package en.codegym.task.pro.task03.task0310;

import java.util.Scanner;

/* 
The hard way...
*/

public class Solution {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    String result;
    if (number < 5) {
      result = "The number is less than 5";
    } else if (number > 5) {
      result = "The number is greater than 5";
    } else {
      result = "The number is equal to 5";
    }

    System.out.println(result);
  }
}
