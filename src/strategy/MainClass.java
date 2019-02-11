package strategy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 16:07
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args){

        Md5Strategy md5Strategy = new Md5Strategy();

        md5Strategy.encrypt();

        Context context = new Context(new Md5Strategy());
        context.encrypt();

        Context context1 = new Context(new MDSStrategy());
        context1.encrypt();

    }
}
