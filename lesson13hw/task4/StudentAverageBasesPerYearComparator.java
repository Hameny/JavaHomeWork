package tms.java.lesson12.lesson13hw.task4;

import java.util.Comparator;

public class StudentAverageBasesPerYearComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Double.compare(o1.getAverageScoreForTheYear(),o2.getAverageScoreForTheYear());
    }
}
