package observer;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 19:31
 * @Describe：
 **/
public class MainClass {

    public static void main(String[] args){

        Person person = new Person();

        person.addObserver(new MyObServer());
        person.setName("mikey");


    }
}
