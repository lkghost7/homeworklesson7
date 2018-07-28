package by.itacademy.lesson7.circlegroup;

import by.itacademy.lesson7.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return String.format("окружность радиусом %.2f", radius);
    }

    @Override
    public String outputToDisplay() {
        return "круг";
    }
}