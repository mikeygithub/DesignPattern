package factorymethod;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 12:58
 * @Describe：
 **/
public class Bannana implements Fruit {
    public void getBannana(){
        System.out.println("采集香蕉");
    }

    @Override
    public void get() {
        System.out.println("采集香蕉");
    }
}
