package exercises;


public class JavaExerciseTwo_QuesOne {
    public static void main(String[] args) {
        QuesOneCircle circle = new QuesOneCircle(5);
        QuesOneRectangle rectangle = new QuesOneRectangle(4, 6);

        circle.displayShapeName();
        circle.calculateArea();

        System.out.println();

        rectangle.displayShapeName();
        rectangle.calculateArea();
    }

}
// Abstract class Shape
abstract class QuesOneShape {
    // Abstract method to calculate the area
    abstract void calculateArea();

    // Abstract method to display the shape name
    abstract void displayShapeName();
}

// Concrete subclass Circle
class QuesOneCircle extends QuesOneShape {
    private double radius;

    QuesOneCircle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Circle");
    }
}

// Concrete subclass Rectangle
class QuesOneRectangle extends QuesOneShape {
    private double length;
    private double width;

    QuesOneRectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Rectangle");
    }
}








