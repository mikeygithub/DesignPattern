package prototype;

import java.util.List;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 19:17
 * @Describe：实现Cloneable接口才可以进行克隆
 **/
public class Person implements Cloneable{
    private String name;
    private int age;
    private String sex;
    private List<Person> personList;

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
    public Person clone() {
        try {
            return (Person) super.clone();//Object
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
