package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("배열의 크기를 입력하십시오 : ");
            int Size = sc.nextInt();
            if(Size <= 0) throw new IllegalArgumentException();
            List<Integer> number = new ArrayList<>();
            System.out.println("배열 요소를 입력하십시오 : ");
            for(int i=0 ;i<Size; i++){
                int N = sc.nextInt();
                number.add(N);
            }
            System.out.println("중복된 숫자 서브 배열 : ");
            for(int i = 0; i<Size; i++){
                if(number.size()<=i) break;
                List<Integer> duplicate = new ArrayList<>();
                int current = number.get(i);
                int count = 0;
                while(number.contains(current)){
                    int idx = number.indexOf(current);
                    duplicate.add(current);
                    number.remove(idx);
                    count++;
                }
                if(count > 1) System.out.println(duplicate);
            }
        }catch(IllegalArgumentException e){
            System.out.println("0보다 큰 값을 입력하세요.");
        }catch(InputMismatchException e){
            System.out.println("입력값을 확인하세요.");
        }finally {
            sc.close();
        }
    }
}
