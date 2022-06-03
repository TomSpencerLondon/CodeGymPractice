package en.codegym.task.pro;

public class LongestCommonPrefix {

  public static void main(String[] args) {
    String[] inputs = {"String1", "Strapolation", "Strength", "St"};

    String result = getLongestCommonPrefix(inputs);
    System.out.println(result);
  }

  private static String getLongestCommonPrefix(String[] inputs) {
    StringBuilder builder = new StringBuilder();
    if (inputs.length == 0) {
      return "";
    }

    for (int i = 0; i < inputs[0].length(); i++) {
      char letter = inputs[0].charAt(i);
      boolean brokeRule = false;
      for (int j = 1; j < inputs.length; j++) {
        String word = inputs[j];
        if (word.length() <= i || word.charAt(i) != letter) {
          brokeRule = true;
          break;
        }
      }
      if (!brokeRule) {
        builder.append(letter);
      } else {
        break;
      }
    }

    return builder.toString();
  }
}
