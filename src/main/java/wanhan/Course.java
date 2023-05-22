package wanhan;
public class Course {
    private String name;
    private int id;
    private int capacity;
    private int enrolled;

    public Course(String name, int id, int capacity) {
        this.name = name;
        this.id = id;
        this.capacity = capacity;
        this.enrolled = 0;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getEnrolled() {
        return enrolled;
    }

    public boolean enroll() {
        if (enrolled < capacity) {
            enrolled++;
            return true;
        } else {
            return false;
        }
    }

    public void drop() {
    }
}



