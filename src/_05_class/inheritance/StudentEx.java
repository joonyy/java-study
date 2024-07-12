package _05_class.inheritance;

public class StudentEx {
    public static void main(String[] args) {
        //1. field가 public인 경우
//        Student std1 = new Student("김철수", 5);
//
//        //Person으로부터 상속받은 필드
//        System.out.println(std1.name);
//        System.out.println(std1.age);
//
//        //Student로부터 상속받은 메서드
//        System.out.println(std1.campus);
//
//        std1.say();
//        std1.eat("바나나");
//
//        std1.setCampus("염리");
//        System.out.println(std1.campus);
        //2. field가 private인 경우
        Student std1 = new Student("김철수", 12);
        System.out.println(std1.getName());
        System.out.println(std1.getAge());

        //Student 필드 읽기
        System.out.println(std1.getCampus());

        //Person으로부터 상속받은 메서드 호출
        std1.say();
        std1.eat("사과");

        std1.setCampus("염리");
        System.out.println(std1.getCampus());
    }
}
