package _05_class.inheritance.practice;

public class Dog extends Animal{
    public Dog(String name, int age){
        this.species = "강아지";
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("멍멍");
    }
    public void action(){
        System.out.println("강아지의 행동");
    }
}
