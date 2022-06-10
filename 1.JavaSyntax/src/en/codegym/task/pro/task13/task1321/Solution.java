package en.codegym.task.pro.task13.task1321;

public class Solution {

    public static void main(String[] args) {
        System.out.println(getTranslationForDayOfWeek("Tuesday"));
        System.out.println(getTranslationForDayOfWeek("Friday"));
        System.out.println(getTranslationForDayOfWeek("Funday"));
    }

    public static String getTranslationForDayOfWeek(String en) {
        String pigLatin;

        String day = en.toLowerCase();
        if (day.equals("monday")) {
            pigLatin = "Ondaymay";
        } else if (day.equals("tuesday")) {
            pigLatin = "Uesdaytay";
        } else if (day.equals("wednesday")) {
            pigLatin = "Ednesdayway";
        } else if (day.equals("thursday")) {
            pigLatin = "Ursdaythay";
        } else if (day.equals("friday")) {
            pigLatin = "Idayfray";
        } else if (day.equals("saturday")) {
            pigLatin = "Aturdaysay";
        } else if (day.equals("sunday")) {
            pigLatin = "Undaysay";
        } else {
            pigLatin = "Invalid day of the week";
        }

        return pigLatin;
    }
}
