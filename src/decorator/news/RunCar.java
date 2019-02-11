package decorator.news;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 13:23
 * @Describe：
 **/
public class RunCar implements Car {
    public void run(){
        System.out.println("car run--------->>>>>");
    }
    public void show(){
        this.run();
    }
}
