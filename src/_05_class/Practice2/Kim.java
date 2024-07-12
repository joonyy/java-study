package _05_class.Practice2;

public class Kim extends Student{
    Kim(String name, String school, int age, int student_ID){
        super(name, school, age, student_ID);
    }

    public String todo() {
        return "김가네 김밥";
    }
}
