package proxy.JDK;

import java.lang.reflect.Proxy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:21
 * @Describe：
 **/
public class Mainlass {
    public static void main(String[] args){

        RealSubject realSubject = new RealSubject();

        MyHandler myHandler = new MyHandler();

        myHandler.setRealSubject(realSubject);

        Subject proxyInstance = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),realSubject.getClass().getInterfaces(),myHandler);

        proxyInstance.sailBook();



    }
}
