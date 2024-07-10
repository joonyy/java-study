package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("배열의 크기를 입력하세요!");
            int Size = sc.nextInt();
            if(Size == 0) throw new IllegalArgumentException();
            int[] arr = new int[Size];
            double sum = 0;
            System.out.println("배열의 요소들을 공백으로 구분해 입력해주세요!");
            for(int i = 0; i<Size;i++){
                arr[i] = sc.nextInt();
                sum+=arr[i];
            }
            double average = sum/Size;
            System.out.println("배열 요소의 평균값 : "+average);

        }catch(InputMismatchException e){
            System.out.println("입력 형식이 잘못되었습니다.");
        }catch (NegativeArraySizeException | IllegalArgumentException e){
            System.out.println("0보다 큰 값을 입력하세요.");
        }
    }
}
