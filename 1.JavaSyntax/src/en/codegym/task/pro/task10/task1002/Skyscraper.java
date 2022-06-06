package en.codegym.task.pro.task10.task1002;

/* 
Let's build a new residential complex: CodeRush Towers
*/

public class Skyscraper {
    public static final String SKYSCRAPER_WAS_BUILT = "The skyscraper was built.";
    public static final String SKYSCRAPER_WAS_BUILT_FLOOR_COUNT = "The skyscraper was built. Number of floors: ";
    public static final String SKYSCRAPER_WAS_BUILT_DEVELOPER = "The skyscraper was built. Developer: ";

    //write your code here


    public Skyscraper() {
        System.out.println(SKYSCRAPER_WAS_BUILT);
    }

    public Skyscraper(int floorCount) {
        System.out.println(SKYSCRAPER_WAS_BUILT_FLOOR_COUNT + floorCount);
    }

    public Skyscraper(String developer) {
        System.out.println(SKYSCRAPER_WAS_BUILT_DEVELOPER + developer);
    }


    public static void main(String[] args) {
        Skyscraper skyscraper = new Skyscraper();
        Skyscraper skyscraperTower = new Skyscraper(50);
        Skyscraper skyscraperSkyline = new Skyscraper("CodeGymDevelopment");
    }
}

