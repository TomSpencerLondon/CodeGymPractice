package en.codegym.task.pro.task10.task1003;

/* 
Let's build a new business complex: CodeGym Business Center
*/

public class Skyscraper {
    private int floorsCount;
    private String developer;

    //write your code here

    public Skyscraper() {
        this.floorsCount = 5;
        this.developer = "CodeGymDevelopment";
    }

    public Skyscraper(int floorsCount, String developer) {
        this.floorsCount = floorsCount;
        this.developer = developer;
    }

    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperUnknown = new Skyscraper(50, "Unknown");
    }
}
