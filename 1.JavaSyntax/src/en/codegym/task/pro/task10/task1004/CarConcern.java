package en.codegym.task.pro.task10.task1004;

/* 
Need for speed
*/

public class CarConcern {
    private final String manufacturer = "Lamborghini";
    private final String model;
    private final int year;
    private final String color;

    public CarConcern(String model, int year, String color) {
        //write your code here
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public CarConcern(String model, int year) {
        //write your code here
        this.model = model;
        this.year = year;
        this.color = "Orange";
    }

    public CarConcern(String model) {
        //write your code here
        this.model = model;
        this.year = 4321;
        this.color = "Orange";
    }
}
