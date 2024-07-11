package _05_class._access_modifier._pack5;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("minion");
        Person p2 = new Person("pooh");
        System.out.println(p1.getAge());

//        p1.age = 4 // age는 private 필드이므로 컴파일 에러.
        p1.setAge(4); //public 메서드를 통해서 간접적으로 필드 변경.
        System.out.println(p1.getName() + "의 나이는 " + p1.getAge()+"살");

        p2.setAge(-5); // setAge 로직에 의해 0으로 변경.
        System.out.println(p2.getName() + "의 나이는 " + p2.getAge()+"살");
    }
}
