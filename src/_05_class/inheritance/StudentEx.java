package _05_class.inheritance;

public class StudentEx {
    public static void main(String[] args) {
        Student std1 = new Student("김철수", 5);

        //Person으로부터 상속받은 필드
        System.out.println(std1.name);
        System.out.println(std1.age);

        //Student로부터 상속받은 메서드
        System.out.println(std1.campus);

        std1.say();
        std1.eat("바나나");

        std1.setCampus("염리");
        System.out.println(std1.campus);
    }
}
