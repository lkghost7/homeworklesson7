package by.itacademy.lesson7.trianglegroup;


import by.itacademy.lesson7.Shape;

public class Triangle extends Shape {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    double getSideA() {
        return sideA;
    }

    double getSideB() {
        return sideB;
    }

    double getSideC() {
        return sideC;
    }

    public double[] getHeights() {
        double temp = 2 * getArea();
        return new double[]{temp / sideA, temp / sideB, temp / sideC};
    }

    @Override
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    @Override
    public double getArea() {
        double halfPerimeter = getPerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public String outputToDisplay() {
        return "треугльник";
    }

    @Override
    public String toString() {
        return (String.format(
                "треугольник со сторонами: %.2f; %.2f; %.2f",
                sideA,
                sideB,
                sideC
        ));
    }
}