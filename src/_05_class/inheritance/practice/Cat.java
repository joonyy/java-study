package _05_class.inheritance.practice;

public class Cat extends Animal{

    public Cat(String name, int age){
        this.species = "고양이";
        this.name = name;
        this.age = age;
    }

    @Override
    void makeSound() {
        super.makeSound();
        System.out.println("야옹");
    }

    public void action(){
        System.out.println("고양이의 행동");
    }
}
