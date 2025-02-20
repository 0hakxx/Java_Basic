package OOP;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.height=5;
        rectangle.width=5;

        int area = rectangle.calculateArea(rectangle.height,rectangle.height);
        System.out.println("넓이: " + area);
        int perimeter = rectangle.calculatePerimeter(rectangle.height,rectangle.height);
        System.out.println("둘레 길이: " + perimeter);

        rectangle.alculateArea(rectangle.height,rectangle.height);
    }

}
