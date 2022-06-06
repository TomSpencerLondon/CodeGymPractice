package en.codegym.task.pro.task10.task1005;

/* 
Serial entrepreneur
*/

public class Building {
    private String type;


    public void initialize(String type) {
        this.type = type;
    }

    //write your code here

    public static void main(String[] args) {
        Building building = new Building();
        building.initialize("Barbershop");
    }
}
