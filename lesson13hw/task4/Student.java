package tms.java.lesson12.lesson13hw.task4;

import java.util.List;

public class Student {

    public static boolean highestScore;
    private String name;
    private String surname;
    private int age;
    private double averageScoreForTheYear;

    public Student (String name,String surname, int age, double averageScoreForTheYear){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.averageScoreForTheYear = averageScoreForTheYear;
    }
    public static Student maximumAverageScore(List<Student> list) {
        Student highestScore = null;
        for (Student student : list) {
            if (highestScore== null || student.getAverageScoreForTheYear() > highestScore.getAverageScoreForTheYear()){
                highestScore=student;
            }

        }
        return highestScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAverageScoreForTheYear() {
        return averageScoreForTheYear;
    }

    public void setAverageScoreForTheYear(double averageScoreForTheYear) {
        this.averageScoreForTheYear = averageScoreForTheYear;
    }

    public String getFullName(){
        return getName() + "" + getSurname();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", averageScoreForTheYear=" + averageScoreForTheYear +
                '}';
    }
}
