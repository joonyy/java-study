package _07_generic.Practice;

import _05_class._access_modifier._pack2.C;

class Calculator<T extends Number>{
    private T num1;
    private T num2;

    public Calculator(T num1, T num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add(){
        return num1.doubleValue() + num2.doubleValue();
    }

}
public class GenericPr02 {
    public static void main(String[] args) {
        Calculator<Integer> ic = new Calculator<>(7, 8);
        Calculator<Double> dc = new Calculator<>(2.64, (double)3);
        System.out.println("Integer Sum: "+ ic.add());
        System.out.println("Double Sum: "+ dc.add());
    }
}
