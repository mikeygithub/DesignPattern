package singleton;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 18:57
 * @Describe：
 **/
public class Person {

    public static Person person=null;
//    public static Person person=new Person();//饿汉式

    private Person(){}

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 懒汉式
     * @return
     */
    public static Person getPerson(){

        if (person==null){
            person=new Person();
        }

        return person;
    }
}
