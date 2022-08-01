package tms.java.lesson12.lesson13hw.task4;

import java.util.Comparator;

public class StudentFullNameComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getFullName().compareTo(o2.getFullName());
    }
}
