package _05_class;

public class StudentEx {

    public static void main(String[] args) {
        Student s1 = new Student("김철수",1);
        System.out.println(s1);

        //메서드 호출
        s1.goToSchool();
        s1.study("Java Programming");
        System.out.println(s1.getGrade() + "학년");
        System.out.println(s1.getTestResult(100));

        Student s2 = new Student("이찬혁", 2);
        System.out.println("s2 = "+s2);
    }
}
