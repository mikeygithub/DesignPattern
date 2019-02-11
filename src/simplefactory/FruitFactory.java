package simplefactory;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 13:03
 * @Describe：
 **/
public class FruitFactory {

//    /**
//     * 获得实例
//     */
//    public Fruit getApple(){
//        return new Apple();
//    }
//    /**
//     * 获得实例
//     */
//    public Fruit getBannana(){
//        return new Bannana();
//    }
    /**
     * 获得实例
     */
    public static Fruit getApple(){
        return new Apple();
    }
    /**
     * 获得实例
     */
    public static Fruit getBannana(){
        return new Bannana();
    }

    /**
     * get方法回去所有
     * @param type
     * @return
     */
    public static Fruit getFruit(String type) throws IllegalAccessException, InstantiationException {
//        if (type.equalsIgnoreCase("apple")){
//            return  Apple.class.newInstance();
//        }
//        else if (type.equalsIgnoreCase("bannana")){
//            return Bannana.class.newInstance();
//        }else {
//            System.out.println("找不到相对应的实例化类");
//            return null;
//        }
        try {
            Class fruit = Class.forName(type);
            return (Fruit) fruit.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
