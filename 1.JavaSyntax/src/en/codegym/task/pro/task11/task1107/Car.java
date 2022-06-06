package en.codegym.task.pro.task11.task1107;

/* 
The engine — the heart of the car
*/

public class Car {
    //write your code here

  Engine engine;

  class Engine {
    private boolean isRunning;

    public void start() {
      this.isRunning = true;
    }

    public void stop() {
      this.isRunning = false;
    }
  }
}
