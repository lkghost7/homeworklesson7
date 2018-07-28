package by.itacademy.lesson7.quadranglegroup;

import by.itacademy.lesson7.trianglegroup.RightTriangle;

public class Rectangle extends Quadrangle {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    @Override
    public double[] getDiagonals() {
        return new double[]{new RightTriangle(sideA, sideB).getHypotenuse()};
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }

    @Override
    public String toString() {
        return String.format(
                "прямоугольник со сторонами: %.2f; %.2f",
                sideA,
                sideB
        );
    }

    @Override
    public String outputToDisplay() {
        return "прямоугольник";
    }
}