package by.itacademy.lesson7.quadranglegroup;

public class Parallelogram extends Quadrangle {
    private double sideA;
    private double sideB;
    private double sharpCorner;

    public Parallelogram(double sideA, double sideB, double sharpCorner) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sharpCorner = sharpCorner;
    }

    double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    double getSharpCorner() {
        return sharpCorner;
    }

    public double[] getHeights() {
        double temp = Math.sin(Math.toRadians(sharpCorner));
        return new double[]{
                sideA * temp,
                sideB * temp,};
    }

    @Override
    public double getPerimeter() {
        return sideA * 2 + sideB * 2;
    }

    @Override
    public double getArea() {
        return Math.sin(Math.toRadians(sharpCorner)) * sideA * sideB;
    }

    @Override
    public double[] getDiagonals() {
        double tempRezultOne = Math.pow(sideA, 2) + Math.pow(sideB, 2);
        double tempRezultTwo = 2 * sideA * sideB * Math.cosh(Math.toRadians(sharpCorner));
        return new double[]{Math.sqrt(tempRezultOne - tempRezultTwo), Math.sqrt(tempRezultOne + tempRezultTwo)};
    }

    @Override
    public String toString() {
        return String.format(
                "параллелограмм cо сторонами: %.2f; %.2f и углом %.2f",
                sideA,
                sideB,
                this.sharpCorner);
    }

    @Override
    public String outputToDisplay() {
        return "паралелограмм";
    }
}