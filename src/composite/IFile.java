package composite;

import java.util.List;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:29
 * @Describe：
 **/
public interface IFile {
    public void display();
    public boolean add(IFile iFile);
    public boolean remove(IFile iFile);
    public List<IFile> getChild();
}
