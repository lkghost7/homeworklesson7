package by.itacademy.lesson7;

import by.itacademy.lesson7.quadranglegroup.Quadrangle;
import by.itacademy.lesson7.quadranglegroup.Parallelogram;
import by.itacademy.lesson7.trianglegroup.Triangle;

public class ShapeUtils {

    public static boolean isShapeToDisplay(Shape shape) {
        return shape instanceof IOutputToDisplay;
    }

    public static boolean isShapeQuadrangle(Shape shape) {
        return shape instanceof Quadrangle;
    }

    public static boolean isShapeTriangle(Shape shape) {
        return shape instanceof Triangle;
    }

    public static boolean isShapeParallelogram(Shape shape) {
            return shape instanceof Parallelogram;
    }

    public static void printParametrsShape(String message, double... values) {
        System.out.print(message);
        for (double value : values) {
            System.out.printf("%.2f  ", value);
        }
        System.out.println();
    }
}