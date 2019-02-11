package proxy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 21:49
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args){

        Subject realSubject = new RealSubject();

        realSubject.sailBook();


        ProxySubject proxySubject = new ProxySubject();

        proxySubject.setRealSubject(new RealSubject());

        proxySubject.sailBook();


    }
}
