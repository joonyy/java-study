package _05_class.Practice2;

public abstract class Student {
    public String name;
    public String school;
    public int age;
    public int student_ID;

    Student(String name, String school, int age, int student_ID){
        this.name = name;
        this.school = school;
        this.age = age;
        this.student_ID = student_ID;
        displayInfo();
    }
    abstract String todo();

    public void displayInfo(){
        System.out.println("=== "+ this.name + " 학생의 정보 ===");
        System.out.println("학교 : "+ this.school + " 고등학교");
        System.out.println("나이 : "+this.age);
        System.out.println("학번 : "+this.student_ID);
        System.out.println("점심은 "+todo());
    }
}
