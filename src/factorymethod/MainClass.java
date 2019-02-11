package factorymethod;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-09 15:13
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {


        FruitFactory fruitFactory=new AppleFactory();

        Fruit fruit=fruitFactory.getFruit();

        fruit.get();

        System.out.println(fruit.getClass());

    }
}
