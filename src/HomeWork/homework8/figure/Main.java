package HomeWork.homework8.figure;

public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        Triangle triangle = new Triangle(12, 12, 12);
        Triangle triangle1 = new Triangle(5, 5, 5);
        Circle circle = new Circle(5);
        aRectangle aRectangle = new aRectangle(5);
        aRectangle aRectangle1 = new aRectangle(5);
        figures[0] = triangle1;
        figures[1] = triangle;
        figures[2] = circle;
        figures[3] = aRectangle;
        figures[4] = aRectangle1;
        for (Figure figure : figures
        ) {
            figure.show();
        }
    }
}
