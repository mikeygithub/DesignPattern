package builder;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 21:11
 * @Describe：
 **/
public class PingFangBuilder implements HouseBuidler{

    House house=new House();

    @Override
    public void makeFloor() {
        house.setFloor("平房----->地板");
    }

    @Override
    public void makeWall() {
        house.setWall("平房----->墙");

    }

    @Override
    public void makeHouseTop() {
        house.setHousetop("平房----->房顶");
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }
}
