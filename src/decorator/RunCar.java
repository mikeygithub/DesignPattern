package decorator;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 23:57
 * @Describe：
 **/
public class RunCar implements Car {
    @Override
    public void show() {
        this.run();
    }

    /**
     * run
     */
    private void run() {
        System.out.println("the car can run......");
    }
}
