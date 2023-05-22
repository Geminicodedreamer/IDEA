package wanhan;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        CourseRegistrationSystem system = new CourseRegistrationSystem();
        system.addCourse("Math", 101, 30);
        system.addCourse("English", 102, 25);
        system.addCourse("History", 103, 20);

        List<Course> courses1 = new ArrayList<>();
        courses1.add(system.courses.get(0));
        courses1.add(system.courses.get(1));
        List<Course> courses2 = new ArrayList<>();
        courses2.add(system.courses.get(1));
        courses2.add(system.courses.get(2));

        system.addStudent("Alice", 1, courses1);
        system.addStudent("Bob", 2, courses2);

        System.out.println("Before enrollment:");
        System.out.println(system.courses.get(0).getName() + " enrolled: " + system.courses.get(0).getEnrolled());
        System.out.println(system.courses.get(1).getName() + " enrolled: " + system.courses.get(1).getEnrolled());
        System.out.println(system.courses.get(2).getName() + " enrolled: " + system.courses.get(2).getEnrolled());

        system.students.get(0).enroll(system.courses.get(0));
        system.students.get(0).enroll(system.courses.get(1));
        system.students.get(1).enroll(system.courses.get(1));
        system.students.get(1).enroll(system.courses.get(2));

        System.out.println("After enrollment:");
        System.out.println(system.courses.get(0).getName() + " enrolled: " + system.courses.get(0).getEnrolled());
        System.out.println(system.courses.get(1).getName() + " enrolled: " + system.courses.get(1).getEnrolled());
        System.out.println(system.courses.get(2).getName() + " enrolled: " + system.courses.get(2).getEnrolled());

        system.students.get(0).drop(system.courses.get(0));
        system.students.get(1).drop(system.courses.get(2));

        System.out.println("After dropping:");
        System.out.println(system.courses.get(0).getName() + " enrolled: " + system.courses.get(0).getEnrolled());
        System.out.println(system.courses.get(1).getName() + " enrolled: " + system.courses.get(2).getEnrolled());
        System.out.println(system.courses.get(2).getName() + " enrolled: " + system.courses.get(2).getEnrolled());
    }
}
