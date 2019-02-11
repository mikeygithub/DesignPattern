package decorator;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 23:44
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args){

        Car car1 = new RunCar();

        Car car2 = new FlyCar();

        car1.show();

    }
}
