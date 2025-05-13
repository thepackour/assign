public class RectangleOopMain {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle();
        rect1.width = 5;
        rect1.height = 8;

        int area = rect1.calculateArea();
        System.out.println("넓이: " + area);

        int perimeter = rect1.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = rect1.isSquare();
        System.out.println("정사각형 여부: " + square);
    }
}
