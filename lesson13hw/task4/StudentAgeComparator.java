package tms.java.lesson12.lesson13hw.task4;

import java.util.Comparator;

public class StudentAgeComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return Integer.compare(o2.getAge(), o1.getAge());
    }
}
