package cn.test.clone.deep.cloneable;

/**
 * Created by xiaoni on 2018/12/19.
 */
public class Professor implements Cloneable {
    public String name;
    public int age;

    public Professor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.toString());
        }
        return o;
    }
}
