package _05_class.inheritance;

public class DogEx {
    public static void main(String[] args) {
        Dog myDog = new Dog();

        //메서드 호출
        myDog.makeSound();

        myDog.fetch(); // 자식 클래스의 메서드
    }

}
