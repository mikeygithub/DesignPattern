package strategy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 16:09
 * @Describe：
 **/
public class MDSStrategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("MDS加密");
    }
}
