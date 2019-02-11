package flyweight;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 21:26
 * @Describe：
 **/
public class MyCharacter {
    private char mychar;

    public MyCharacter(char mychar) {
        this.mychar = mychar;
    }
    public void display(){
        System.out.println("Message:"+mychar);
    }
}
