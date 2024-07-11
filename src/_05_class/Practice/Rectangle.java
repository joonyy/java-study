package _05_class.Practice;

public class Rectangle {
    private int width;
    private int height;

    static int Nums = 0;
    public Rectangle(int width){
        this.width=width;
        Nums++;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int Area(){
        return this.width * this.height;
    }
}
