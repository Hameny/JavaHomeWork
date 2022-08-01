package tms.java.lesson12.lesson13hw.task4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();
        list.add(new Student("Pavel", "Maximov", 14, 7));
        list.add(new Student("Olga", "Zubova", 15, 8.2));
        list.add(new Student("Vasya", "Lucky", 17, 9));
        list.add(new Student("Kolya", "Vlasov", 15, 8.3));
        list.add(new Student("Grisha", "Butko", 14, 7.3));


        list.sort(new StudentFullNameComparator());
        list.sort(new StudentAgeComparator());
        list.sort(new StudentAverageBasesPerYearComparator());
        System.out.println(list);

        list.sort(new StudentFullNameComparator().thenComparing(new StudentAgeComparator()).
                thenComparing(new StudentAverageBasesPerYearComparator()));


        System.out.println("Max average score for the year " + Student.maximumAverageScore(list));
    }
}
