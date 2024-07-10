package _05_class;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }

    public int Area(){
        return this.width * this.height;
    }

}
