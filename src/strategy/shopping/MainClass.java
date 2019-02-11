package strategy.shopping;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 16:15
 * @Describe：
 **/
public class MainClass {

    public static void main(String[] args){

//        Context context = new Context(new StrategyA());

        Context context = new Context(new StrategyB());

        context.strategy((double) 100L);

    }
}
