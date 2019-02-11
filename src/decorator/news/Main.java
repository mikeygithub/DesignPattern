package decorator.news;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 13:22
 * @Describe：
 **/
public class Main {
    public static void main(String[] args){

        RunCar runCar = new RunCar();
        runCar.show();

        Car car=new FlyCarDecorator(runCar);
        car.show();

    }
}
