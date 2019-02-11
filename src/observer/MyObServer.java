package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 19:32
 * @Describe：
 **/
public class MyObServer  implements Observer {
    @Override
    public void update(Observable o, Object arg) {

        System.out.println("观察对象发生了变化");
    }
}
