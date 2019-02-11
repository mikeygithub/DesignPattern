package composite;

import java.util.List;

/**
 * @Program: DesignPattern
 * @Author: 麦奇
 * @Email： 1625017540@qq.com
 * @Create: 2019-02-11 22:26
 * @Describe：
 **/
public class MainClass {
    public static void main(String[] args){

        Folder folder = new Folder("C:");
        Folder mikey = new Folder("mikey");
        File file = new File("leo.txt");

        mikey.add(file);
        folder.add(mikey);
//        folder.add(file);

        display(folder);

    }
    public static void display(IFile rootFilder){
        rootFilder.display();
        List<IFile> child = rootFilder.getChild();
        for (IFile i :
                child) {
            if (i instanceof File){
                i.display();
            }else {
                display(i);
            }
        }
    }
}
