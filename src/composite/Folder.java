package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:33
 * @Describe：
 **/
public class Folder implements IFile{
    private String name;

    private List<IFile> children;

    public Folder(String name) {
        this.name = name;
        this.children = new ArrayList<IFile>();
    }

    public Folder(String name, List<IFile> children) {
        this.name = name;
        this.children = new ArrayList<IFile>();
    }

    @Override
    public void display() {

        System.out.println(name);
    }

    @Override
    public boolean add(IFile iFile) {
        children.add(iFile);
        return false;
    }

    @Override
    public boolean remove(IFile iFile) {
        children.remove(iFile);
        return false;
    }

    @Override
    public List<IFile> getChild() {
        return children;
    }
}
