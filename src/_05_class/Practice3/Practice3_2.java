package _05_class.Practice3;

import _05_class._access_modifier._pack3.A;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

abstract class Vehicle{
    public String name;
    public int maxSpeed;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
this.name = name;
    }

    public int getMaxSpeed() {
        return this.maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public abstract void move();
}

interface Flyable{
    void fly();
}

class Car extends Vehicle{

    @Override
    public void move() {
        System.out.println("도로를 따라 이동중");
    }
}

class Airplane extends Vehicle implements Flyable{

    @Override
    public void move() {
        System.out.println("하늘을 날아가는 중");
    }

    @Override
    public void fly() {
        System.out.println("고도 10,000피트에서 비행 중");
    }
}

public class Practice3_2 {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        Car car = new Car();
        Airplane airplane = new Airplane();
        vehicles.add(car);
        vehicles.add(airplane);
        for(Vehicle vehicle : vehicles){
            vehicle.move();
            if(vehicle instanceof Airplane) ((Airplane) vehicle).fly();
        }
    }
}
