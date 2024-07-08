package _02_control_statement;

import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("3개의 정수를 space로 구분하여 적으세요.");
        int[] nums = new int[3];
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        double sum = 0;
        double average = 0;
        for(int i=0;i<nums.length;i++){
            nums[i] = sc.nextInt();
            if(nums[i] > Max) Max = nums[i];
            if(nums[i] < Min) Min = nums[i];
            sum += nums[i];
        }
        average = sum / 3;
        System.out.println("최댓값 : " + Max);
        System.out.println("최솟값 : " + Min);
        System.out.println("합계 : " + (int)sum);
        System.out.println("평균 : " + average);
    }
}
