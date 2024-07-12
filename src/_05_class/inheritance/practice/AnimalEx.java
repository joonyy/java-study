package _05_class.inheritance.practice;

public class AnimalEx {
    public static void main(String[] args) {
        Cat c1 = new Cat("나비", 4);
        Dog d1 = new Dog("슈", 8);
        c1.makeSound();
        c1.action();
        d1.makeSound();
        d1.action();
    }
}
