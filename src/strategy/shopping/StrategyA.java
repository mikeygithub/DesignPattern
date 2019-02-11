package strategy.shopping;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 16:16
 * @Describe：
 **/
public class StrategyA implements Strategy {
    @Override
    public double cost(Double cost) {
        return cost*0.8;
    }
}
