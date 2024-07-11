package _05_class._access_modifier._pack3;

public class A {
    public int field1;// public field
    int field2;//default field
    private int field3;//private field

    //생성자
    public A(){
        this.field1 = 1;
        this.field2 = 2;
        this.field3 = 3;

        method1();
        method2();
        method3();
    }
    //public 메서드
    public void method1(){}
    //default 메서드
    void method2(){}
    //private 메서드
    private void method3(){}
}
