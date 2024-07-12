package _05_class.inheritance.practice;

public class Car extends Vehicle{
    public boolean convertible;
    public Car(String brand, String model, int year, boolean convertible){
        super(brand, model, year);
        this.vehicleType = "Car";
        this.convertible = convertible;
        displayInfo();
    }

    @Override
    void action() {
        System.out.println("주차했습니다.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ",convertible=" + convertible + '\''+
                '}';
    }
}
