package decorator;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 23:55
 * @Describe：
 **/
public class FlyCar implements Car {
    @Override
    public void show() {
        this.run();
        this.fly();
    }

    private void run() {
        System.out.println("the car can run......");
    }

    private void fly() {
        System.out.println("the car can fly......");
    }
}
