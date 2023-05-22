package wanhan;

import java.util.ArrayList;
import java.util.List;

public class Student {
        private String name;
        private int id;
        private List<Course> courses;

        public Student(String name, int id, List<Course> courses) {
            this.name = name;
            this.id = id;
            this.courses = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }

        public List<Course> getCourses() {
            return courses;
        }

        public boolean enroll(Course course) {
            if (course.enroll()) {
                courses.add(course);
                return true;
            } else {
                return false;
            }
        }

        public boolean drop(Course course) {
            if (courses.contains(course)) {
                courses.remove(course);
                course.drop();
                return true;
            } else {
                return false;
            }
        }
    }
