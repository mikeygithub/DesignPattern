package proxy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:06
 * @Describe：
 **/
public class RealSubject implements Subject{
    @Override
    public void sailBook() {
        System.out.println("卖书");
    }
}
