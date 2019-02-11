package composite;

import java.util.List;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:31
 * @Describe：
 **/
public class File  implements IFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void display() {

        System.out.println(name);

    }

    @Override
    public boolean add(IFile iFile) {

        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return getChild();
    }
}
