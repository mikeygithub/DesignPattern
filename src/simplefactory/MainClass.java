package simplefactory;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-09 15:13
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException {

//        Apple apple = new Apple();
//        Bannana bannana = new Bannana();
//
//        apple.getApple();
//        bannana.getBannana();
//
//
//        Fruit fruit1=new Apple();
//        Fruit fruit2=new Bannana();
//
//        ((Apple) fruit1).getApple();
//        ((Bannana) fruit2).getBannana();
//
//        FruitFactory fruitFactory = new FruitFactory();
//        Fruit apple1=fruitFactory.getApple();
//        Fruit bannana1=fruitFactory.getBannana();
//
//        Fruit apple2=FruitFactory.getApple();
//        Fruit bannana2=FruitFactory.getBannana();
//        apple2.getFruit();
//        bannana2.getFruit();
        Fruit apple=FruitFactory.getFruit("simplefactory.Apple");

        Fruit banana=FruitFactory.getFruit("simplefactory.Bannana");

        System.out.println(apple.getClass());
        System.out.println(banana.getClass());
    }
}
