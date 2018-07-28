package by.itacademy.lesson7.quadranglegroup;

public class Rhombus extends Parallelogram {

    public Rhombus(double sideA, double sharpCorner) {
        super(sideA, sideA, sharpCorner);
    }

    @Override
    public double getArea() {
        return Math.sin(Math.toRadians(getSharpCorner())) * Math.pow(getSideA(), 2);
    }

    @Override
    public double getPerimeter() {
        return getArea() * 4;
    }

    @Override
    public double[] getDiagonals() {
        return new double[]{
                getSideA() * Math.sqrt(2 + 2 * Math.cos(Math.toRadians(getSharpCorner()))),
                2 * getSideA() * Math.sin(Math.toRadians(getSharpCorner() / 2))};
    }

    @Override
    public double[] getHeights() {
        return new double[]{getArea() / getSideA()};
    }

    @Override
    public String outputToDisplay() {
        return "ромб";
    }

    @Override
    public String toString() {
        return String.format("ромб со сторонами %.2f и углом %.2f", getSideA(), getSharpCorner());
    }
}