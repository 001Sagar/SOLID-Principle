
import javax.swing.plaf.synth.SynthPasswordFieldUI;

// Definition: Software entities (classes, modules, functions) should be 
// open for extension but closed for modification.

public class OpenClosedPrinciple {

    // class ShapeType {

    // public double calculateArea(String shapeType, int dimension) {
    // // If shapeType is Equal to circle
    // if (shapeType.equals("circle")) {
    // return Math.PI * dimension * dimension;
    // } else if (shapeType.equals("square")) {
    // return dimension * dimension;
    // }

    // return 0;
    // }
    // }

    // Problem:
    // Adding a new shape requires modifying the calculateArea method.

    // Solution:
    // Use polymorphism to extend functionality without modifying the base class:

    abstract static class Shape {
        abstract double area();
    }

    static class Circle extends Shape {

        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        @Override
        double area() {
            return Math.PI * radius * radius;
        }
    }

    static class Square extends Shape {

        double length;

        Square(double length) {
            this.length = length;
        }

        @Override
        double area() {
            return length * length;
        }
    }

    public static void main(String[] args) {

        // Create instances of Circle and Square
        Circle c1 = new Circle(5.00);
        Shape s1 = new Square(10.00);

        System.out.println("Area of the Circle " + c1.area());
        System.out.println("Area of the Square " + s1.area());

    }

}
