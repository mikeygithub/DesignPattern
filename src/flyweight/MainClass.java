package flyweight;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 21:21
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args){

        MyCharacter a = new MyCharacter('a');
        MyCharacter b = new MyCharacter('b');
        MyCharacter c = new MyCharacter('a');
        MyCharacter d = new MyCharacter('d');

        a.display();
        b.display();
        c.display();
        d.display();

        MyCharacterFactory myCharacterFactory = new MyCharacterFactory();
        MyCharacter e = myCharacterFactory.getMyCharacter('e');
        MyCharacter f = myCharacterFactory.getMyCharacter('f');
        MyCharacter e1 = myCharacterFactory.getMyCharacter('e');

        if (e==e1){
            System.out.println("true");
        }
    }
}
