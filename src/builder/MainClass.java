package builder;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 21:04
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args){

//        House house = new House();
//
//        house.setFloor("地板");
//        house.setWall("墙");
//        house.setHousetop("屋顶");
//        HouseBuidler house=new PingFangBuilder();
//
//        house.makeFloor();
//        house.makeHouseTop();
//        house.makeWall();
//
//        House house1 = ((PingFangBuilder) house).getHouse();




//        System.out.println("House:"+house1);
        PingFangBuilder pingFangBuilder = new PingFangBuilder();
        HouseDicrector houseDicrector = new HouseDicrector(pingFangBuilder);
        houseDicrector.makeHouse();

        House hous=pingFangBuilder.getHouse();

        System.out.println(hous);

    }
}
