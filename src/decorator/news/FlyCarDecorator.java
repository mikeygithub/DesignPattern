package decorator.news;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 13:15
 * @Describe：
 **/
public class FlyCarDecorator extends DecoratotCar{

    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void run() {

    }

    public void fly(){
        System.out.println("fyl car--------->>>>>");
    }

    public void show() {
        this.getCar().show();
        this.fly();
    }
}
