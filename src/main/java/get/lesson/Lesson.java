package get.lesson;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.Iterator;

public class Lesson extends public_has implements Cloneable , Iterable<Lesson>{
    ArrayList<Teacher> teachers;
    public Lesson()
    {
        super();
    }

    public void print()
    {
        System.out.println("课程名称 : " + this.getName() + " 课程代码 : " + this.getCode());
        System.out.println("课程任教老师 : ");
        for(Teacher it : teachers)
        {
            it.print();
        }
    }
    @Override
    public Iterator<Lesson> iterator()
    {
        return null;
    }

    @Override
    public Lesson clone() {
        try {
            return (Lesson) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
