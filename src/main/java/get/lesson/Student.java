package get.lesson;

import java.util.ArrayList;
import java.util.Comparator;

public class Student extends public_has implements Comparable<Student> {
    ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    private double grade = 0;
    public Student()
    {
        super();
        setLessons();
    }

    public void setLessons() {
        ArrayList<Lesson> _lessons = new ArrayList<>();

        this.lessons = _lessons;
    }

    @Override
    public int compareTo(Student origin)
    {
        return 0;
    }

}
