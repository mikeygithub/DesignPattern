package strategy;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 16:11
 * @Describe：
 **/
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void encrypt(){
        strategy.encrypt();
    }
}
