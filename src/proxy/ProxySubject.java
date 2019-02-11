package proxy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:06
 * @Describe：
 **/
public class ProxySubject implements Subject{

    private RealSubject realSubject;

    public void setRealSubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void sailBook() {
        System.out.println("========代理卖书========");
        dazhe();
        this.realSubject.sailBook();
        give();
    }

    private void give() {
        System.out.println("代金卷");
    }

    public void dazhe(){
        System.out.println("打折");
    }

}
