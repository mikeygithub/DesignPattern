package factorymethod;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 15:21
 * @Describe：
 **/
public class BananaFactory implements FruitFactory {
    @Override
    public Fruit getFruit(){
        return new Bannana();
    }
}
