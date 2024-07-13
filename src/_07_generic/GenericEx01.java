package _07_generic;

import java.util.ArrayList;

class CustomList{
    ArrayList<String> list = new ArrayList<>();
    public void addElement(String element){list.add(element);}
    public void removeElement(String element){list.remove(element);}
    public String get(int i) {return list.get(i);}

    @Override
    public String toString() {return "CustomList = " + list;}
}


class CustomListGeneric<T>{
    ArrayList<T> list = new ArrayList<>();
    public void addElement(T element){list.add(element);}
    public void removeElement(T element){list.remove(element);}
    public T get(int i) {return list.get(i);}

    @Override
    public String toString() {return "customList = " + list;}
}
public class GenericEx01 {
    public static void main(String[] args) {
        //일반 클래스
        CustomList li = new CustomList();
        li.addElement("first");
        li.addElement("second");
        li.addElement("third");
        System.out.println(li.toString());

        li.removeElement("second");
        System.out.println(li.toString());

        System.out.println(li.get(1));
        System.out.println();

        //제너릭 클래스
        CustomListGeneric<Integer> gli = new CustomListGeneric<>();
        gli.addElement(3);
        gli.addElement(5);
        gli.addElement(8);
        System.out.println(gli.toString());

        CustomListGeneric<Character> cli = new CustomListGeneric<>();
        cli.addElement('A');
        cli.addElement('B');
        cli.addElement('C');
        System.out.println(cli.toString());

    }
}
