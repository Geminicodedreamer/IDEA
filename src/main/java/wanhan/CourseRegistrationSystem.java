package wanhan;

import java.util.ArrayList;
import java.util.List;

public class CourseRegistrationSystem {
    List<Course> courses;
    List<Student> students;

    public CourseRegistrationSystem() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
    }

    public boolean addCourse(String name, int id, int capacity) {
        for (Course course : courses) {
            if (course.getId() == id) {
                return false;
            }
        }
        courses.add(new Course(name, id, capacity));
        return true;
    }

    public boolean removeCourse(int id) {
        for (Course course : courses) {
            if (course.getId() == id) {
                courses.remove(course);
                for (Student student : students) {
                    student.drop(course);
                }
                return true;
            }
        }
        return false;
    }

    public boolean addStudent(String name, int id, List<Course> courses) {
        for (Student student : students) {
            if (student.getId() == id) {
                return false;
            }
        }
        students.add(new Student(name, id, courses));
        return true;
    }

    public boolean removeStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                for (Course course : student.getCourses()) {
                    course.drop();
                }
                return true;
            }
        }
        return false;
    }
}

