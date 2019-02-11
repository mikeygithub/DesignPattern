package flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 21:27
 * @Describe：
 **/
public class MyCharacterFactory {
    private Map<Character,MyCharacter> pool;

    public MyCharacterFactory() {
        this.pool = new HashMap<Character, MyCharacter>();
    }

    public MyCharacter getMyCharacter(Character character){

        MyCharacter myCharacter = pool.get(character);

        if (myCharacter==null){
            myCharacter=new MyCharacter(character);
            pool.put(character,myCharacter);
        }

        return myCharacter;
    }
}
