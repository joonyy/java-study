package _05_class.inheritance.practice;

public class Vehicle {
    public String brand;
    public String model;
    public int year;

    public String vehicleType;

    public Vehicle(String brand, String model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void engineStart(){
        System.out.println("차량 시동을 걸었습니다.");
    }
    void action(){}
    public String toString(){
        return null;
    }
    void engineStop(){
        System.out.println("차량을 정지했습니다.");
    }
    void displayInfo(){
        System.out.println("=== "+vehicleType+" 정보 ===");
        System.out.println(this.toString());
        engineStart();
        action();
        engineStop();
    }

}
