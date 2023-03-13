package HomeWork.homework8.figure;

public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void show() {
        super.show();
        double area = radius * radius * Math.PI;
        double perm = 2 * Math.PI * radius;
        System.out.println("Радиус Круга: " + area);
        System.out.println("Периметр Круга: " + perm);


    }
}
