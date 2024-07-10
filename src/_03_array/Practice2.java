package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("문자를 입력해주세요.");
            String str = sc.nextLine();
            if(str.equals("exit")) break;
            list.add(str);
        }
        for(String s : list){
            System.out.println(s);
        }
    }
}
