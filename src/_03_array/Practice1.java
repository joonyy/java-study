package _03_array;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum = 0;
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
            sum += arr[i];
        }
        System.out.println((double)sum/5);
    }
}
