package by.itacademy.lesson7.starter;

import by.itacademy.lesson7.IOutputToDisplay;
import by.itacademy.lesson7.Shape;
import by.itacademy.lesson7.ShapeUtils;
import by.itacademy.lesson7.circlegroup.Circle;
import by.itacademy.lesson7.quadranglegroup.*;
import by.itacademy.lesson7.trianglegroup.EquilateralTriangle;
import by.itacademy.lesson7.trianglegroup.RightTriangle;
import by.itacademy.lesson7.trianglegroup.Triangle;

public class FigureDemo {

    public static void main(String[] args) {
        Shape[] shapes = createArrayShapes();
           for (Shape shape : shapes) {
            System.out.println(shape);
            if (ShapeUtils.isShapeTriangle(shape)) {
                ShapeUtils.printParametrsShape("высота: ", ((Triangle) shape).getHeights());
            }
            if (ShapeUtils.isShapeQuadrangle(shape)) {
                ShapeUtils.printParametrsShape("диагональ:", ((Quadrangle) shape).getDiagonals());
                if (ShapeUtils.isShapeParallelogram(shape)) {
                    ShapeUtils.printParametrsShape("высота: ", ((Parallelogram) shape).getHeights());
                }
            }
            ShapeUtils.printParametrsShape("периметр: ", shape.getPerimeter());
            ShapeUtils.printParametrsShape("площадь: ", shape.getArea());
            if (ShapeUtils.isShapeToDisplay(shape)) {
                System.out.println(((IOutputToDisplay) shape).outputToDisplay());
            }
            System.out.println("***********************************************");
        }
        shapeEqualsArea(new Square(5), shapes);
    }

    private static Shape[] createArrayShapes() {
        Shape[] shapes = new Shape[8];
        shapes[0] = new Parallelogram(4, 18, 46);
        shapes[1] = new Rectangle(15, 33);
        shapes[2] = new Square(5);
        shapes[3] = new Triangle(7, 11, 8.8);
        shapes[4] = new RightTriangle(9, 5);
        shapes[5] = new EquilateralTriangle(8);
        shapes[6] = new Rhombus(7, 55);
        shapes[7] = new Circle(4.4);
        return shapes;
    }

    private static void shapeEqualsArea(Shape shape, Shape[] shapesArray) {
        double areaShape = shape.getArea();
        for (Shape element : shapesArray) {
            if (areaShape == element.getArea()) {
                System.out.println("Площадь фигуры " + shape.outputToDisplay() +
                        " (" + areaShape + ")  равна площади фигуры " +
                        element.outputToDisplay());
            } else {
                System.out.println(shape.outputToDisplay() + " не равен." );
            }
        }
    }
}