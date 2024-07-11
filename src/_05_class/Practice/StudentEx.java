package _05_class.Practice;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Student> S = new ArrayList<>();
        S.add(new Student("김새싹", 20231001,1));
        S.add(new Student("박지은", 20231002,2));
        S.add(new Student("이은지", 20231002,3));

        Student.displayInfo(S);
    }
}
