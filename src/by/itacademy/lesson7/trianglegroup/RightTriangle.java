package by.itacademy.lesson7.trianglegroup;

public class RightTriangle extends Triangle {

    public RightTriangle(double cachetsFirst, double cachetsSecond) {
        super(cachetsFirst, cachetsSecond, Math.sqrt(Math.pow(cachetsFirst, 2) + Math.pow(cachetsSecond, 2)));
    }

    public double getHypotenuse() {
        return getSideC();
    }

    @Override
    public double getArea() {
        return getSideA() * getSideB() / 2;
    }

    @Override
    public double[] getHeights() {
        return new double[]{getSideA(), getSideB(), getSideA() * getSideB() / getHypotenuse()};
    }

    @Override
    public String outputToDisplay() {
        return "прямоугольный треугольник";
    }

    @Override
    public String toString() {
        return "прямоугольный " + super.toString();
    }
}