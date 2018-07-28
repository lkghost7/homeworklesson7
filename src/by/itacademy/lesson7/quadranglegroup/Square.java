package by.itacademy.lesson7.quadranglegroup;

public class Square extends Rectangle {

    public Square(double sideA) {
        super(sideA, sideA);
    }

    @Override
    public double[] getDiagonals() {
        return new double[]{Math.sqrt(2) * getSideA()};
    }

    @Override
    public double getPerimeter() {
        return getSideA() * 4;
    }

    @Override
    public double getArea() {
        return Math.pow(getSideA(), 2);
    }

    @Override
    public String outputToDisplay() {
        return "квадрат";
    }

    @Override
    public String toString() {
        return String.format("квадрат со стороной: %.2f", getSideA());
    }
}