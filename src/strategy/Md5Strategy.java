package strategy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 16:09
 * @Describe：
 **/
public class Md5Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("执行MD5加密");
    }
}
