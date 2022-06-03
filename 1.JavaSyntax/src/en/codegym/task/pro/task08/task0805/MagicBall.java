package en.codegym.task.pro.task08.task0805;

import java.util.Random;

public class MagicBall {
    private static final String CERTAIN = "Certainly";
    private static final String DEFINITELY = "Definitely";
    private static final String MOST_LIKELY = "Most likely";
    private static final String OUTLOOK_GOOD = "The outlook is good";
    private static final String ASK_AGAIN_LATER = "Ask later";
    private static final String TRY_AGAIN = "Try again";
    private static final String NO = "My answer is no";
    private static final String VERY_DOUBTFUL = "Very doubtful";

    public static String getPrediction() {
        //write your code here
        int number = new Random().nextInt(8);

        switch(number) {
            case 0: return CERTAIN;
            case 1: return DEFINITELY;
            case 2: return MOST_LIKELY;
            case 3: return OUTLOOK_GOOD;
            case 4: return ASK_AGAIN_LATER;
            case 5: return TRY_AGAIN;
            case 6: return NO;
            case 7: return VERY_DOUBTFUL;
        }
        return null;
    }
}
