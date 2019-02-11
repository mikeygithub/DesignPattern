package decorator.news;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 13:12
 * @Describe：
 **/
public abstract class DecoratotCar implements Car{

    private Car car;

    public DecoratotCar(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public abstract void show();
}
