package _05_class.Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Rectangle> rect = new ArrayList<>();
        while(true) {
            System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
            int width = sc.nextInt();
            int height = sc.nextInt();
            if(width==0 && height == 0) break;
            Rectangle r = new Rectangle(width);
            r.setHeight(height);
            rect.add(r);
        }

        while(!rect.isEmpty()) {
            Rectangle r = rect.get(0);
            System.out.println("가로 길이는 : "+ r.getWidth());
            System.out.println("세로 길이는 : "+ r.getHeight());
            System.out.println("넓이는 : " + r.Area());
            System.out.println("----------------------------------");
            rect.remove(0);
        }
        System.out.println("Rectangle 인스턴스의 개수는 : " + Rectangle.Nums);
    }
}
