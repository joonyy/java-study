package _05_class.inheritance.practice;

public class Bus extends Vehicle{
    public int passengerCapacity;
    public Bus(String brand, String model, int year, int passengerCapacity){
        super(brand, model, year);
        this.vehicleType = "Bus";
        this.passengerCapacity = passengerCapacity;
        displayInfo();
    }

    @Override
    void action() {
        System.out.println("승객을 운송합니다.");
    }

    @Override
    public String toString() {
        return "Bus{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ",passengerCapacity=" + passengerCapacity + '\''+
        '}';
    }
}
