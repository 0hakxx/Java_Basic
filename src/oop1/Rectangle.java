package oop1;

public class Rectangle {
    int width;
    int height;
    public int calculateArea(int width, int height){
        return width * height;
    }

    public int calculatePerimeter(int width, int height){
        return (width + height)*2;
    }

    public void alculateArea(int width, int height){
        if(width == height){
            System.out.println("정사각형입니다.");
        }

    }

}
