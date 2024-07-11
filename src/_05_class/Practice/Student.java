package _05_class.Practice;

import java.util.ArrayList;

public class Student {
    static int totalStudents = 0;
    private String name;
    private int student_ID;
    private int grade;

    Student(String name, int student_ID, int grade){
        this.name = name;
        this.grade = grade;
        this.student_ID = student_ID;
        totalStudents++;
    }

    public String getName() {
        return this.name;
    }

    public int getGrade() {
        return this.grade;
    }

    public int getStudent_ID() {
        return this.student_ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudent_ID(int student_ID) {
        this.student_ID = student_ID;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    static void displayInfo(ArrayList<Student> Students){
        for(Student s : Students) {
            System.out.println("==== 학생 정보 ====");
            System.out.println("이름: " +s.name);
            System.out.println("학번: " + s.student_ID);
            System.out.println("학년: " + s.grade);
        }
        System.out.println("총 학생 수는 "+totalStudents +"명 입니다.");
    }
}
