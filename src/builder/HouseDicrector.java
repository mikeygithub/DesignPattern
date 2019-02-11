package builder;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-10 21:26
 * @Describe：
 **/
public class HouseDicrector {
    private HouseBuidler houseBuidler;

    public HouseDicrector(HouseBuidler houseBuidler) {
        this.houseBuidler = houseBuidler;
    }

    public HouseBuidler getHouseBuidler() {
        return houseBuidler;
    }

    public void setHouseBuidler(HouseBuidler houseBuidler) {
        this.houseBuidler = houseBuidler;
    }

    public void makeHouse(){
        houseBuidler.makeWall();
        houseBuidler.makeHouseTop();
        houseBuidler.makeFloor();
    }
}
