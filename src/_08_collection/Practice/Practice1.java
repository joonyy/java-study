package _08_collection.Practice;

import java.util.HashSet;
import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> hashSet = new HashSet<>();
        while(true){
            int N = sc.nextInt();
            if(N== -1) break;
            hashSet.add(N);
        }
        System.out.println(hashSet);
    }
}
