package _05_class.inheritance.practice;

public class MotorCycle extends Vehicle{
    public char licenceType;
    public MotorCycle(String brand, String model, int year, char licenceType){
        super(brand, model, year);
        this.vehicleType = "Car";
        this.licenceType = licenceType;
        displayInfo();
    }

    @Override
    void action() {
        System.out.println("울림통을 합니다.");
    }

    @Override
    public String toString() {
        return "MotorCycle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ",licenceType=" + licenceType + '\''+
                '}';
    }
}

