package _05_class._final;

public class Student {
    // final field

    final String campus = "염리"; // 1. 필드를 선언 시 초기화
    final String sid; // 2. 생성자 초기화

    // instance field
    String name;

    public Student(String sid, String name) {
        this.sid = sid; // 생성자에서 final field 인 sid 의 값을 초기화
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "campus='" + campus + '\'' +
                ", sid='" + sid + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}