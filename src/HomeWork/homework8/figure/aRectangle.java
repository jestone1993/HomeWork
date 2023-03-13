package HomeWork.homework8.figure;

public class aRectangle extends Figure {
    double a;
    double b;

    public aRectangle(int a) {
        this.a = a;
    }

    @Override
    public void show() {
        super.show();
        b = 4 * a;
        System.out.println("Периметр квадрата: " + b);
        a = a * a;
        System.out.println("Площадь квадрата: " + a);
    }
}
