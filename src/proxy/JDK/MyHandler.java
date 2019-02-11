package proxy.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:16
 * @Describe：
 **/
public class MyHandler implements InvocationHandler {

    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result;

        dazhe();
        result=method.invoke(realSubject,args);
        give();

        return result;
    }

    private void give() {
        System.out.println("代金卷");
    }

    private void dazhe() {
        System.out.println("打折");
    }

}
