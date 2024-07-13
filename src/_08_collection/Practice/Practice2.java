package _08_collection.Practice;

import java.util.*;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");
        Map<String, Integer> map = new HashMap();
        while(true){
            System.out.print("이름 입력 :");
            String s = sc.next();
            if(s.equals("종료")) break;
            System.out.print("나이 입력 : ");
            int n = sc.nextInt();
            map.put(s,n);
        }
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        System.out.println("== 입력받은 이름과 나이 목록 ==");
        Iterator<Map.Entry<String,Integer>> it = entrySet.iterator();
        while (it.hasNext()){
            Map.Entry<String,Integer> entry = it.next();
            String name = entry.getKey();
            Integer age = entry.getValue();
            System.out.println("이름 : "+ name+", 나이 : "+age);
        }
    }
}
