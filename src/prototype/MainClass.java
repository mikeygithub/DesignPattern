package prototype;

import java.util.ArrayList;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 19:18
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args){

        Person person = new Person();
        person.setName("Mikey");
        person.setAge(19);
        person.setSex("man");
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person());
        people.add(new Person());
        people.add(new Person());
        person.setPersonList(people);

        System.out.println("Message="+person+person.hashCode());
        System.out.println(person.getPersonList().hashCode());

//        Person person1 = new Person();
        Person person1=person.clone();
//        person1.setName("Mikey");
//        person1.setAge(19);
//        person1.setSex("man");

        System.out.println("Message="+person1+person1.hashCode());
        System.out.println(person1.getPersonList().hashCode());

    }
}
