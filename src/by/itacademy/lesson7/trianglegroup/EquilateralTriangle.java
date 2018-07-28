package by.itacademy.lesson7.trianglegroup;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double side) {
        super(side, side, side);
    }

    @Override
    public double getPerimeter() {
        return 3 * getSideA();
    }

    @Override
    public double getArea() {
        return Math.sqrt(3) / 4 * Math.pow(getSideA(), 2);
    }

    @Override
    public double[] getHeights() {
        return new double[]{Math.sqrt(3) / 2 * getSideA()};
    }

    @Override
    public String outputToDisplay() {
        return "равносторонний треугольник";
    }

    @Override
    public String toString() {
        return "равносторонний " + super.toString();
    }
}