package abstractfactory;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 16:20
 * @Describe：
 **/
public class NorthApple extends Apple{
    @Override
    public void get() {
        System.out.println("采集北方苹果");
    }
}
