package HomeWork.homework8.figure;

public class Triangle extends Figure {

    double a;
    double h;
    double c;
    double b;

    public Triangle(int a, int h, int c) {
        this.a = a;
        this.h = h;
        this.c = c;
    }

    @Override
    public void show() {
        super.show();
        b = a * h / 2;
        c = a + c + h;
        System.out.println("Площадь треугольника: " + b);
        System.out.println("Периметр треугольника: " + c);


    }
}

