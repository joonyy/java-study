package _05_class._final;

public class StudentEx {

    public static void main(String[] args) {
        Student std1 = new Student("s001", "김철수");
        System.out.println(std1);

        // final field 값을 변경 x (읽기 전용)
//        std1.campus = "도화";
//        std1.sid = "s002";

        std1.name = "홍길동";
        System.out.println(std1);
    }

}