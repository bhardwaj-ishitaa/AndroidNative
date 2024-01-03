package exercises;

public class JavaExerciseTwo_QuesFour {
    public static void main(String[] args) {
        // Creating objects of Rectangle, Square, Circle, Triangle, Cube, Cylinder, Cone, Sphere
        Rectangle rectangle = new Rectangle(5, 8);
        Square square = new Square(4);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(3, 4, 5);
        Cube cube = new Cube(4);
        Cylinder cylinder = new Cylinder(2, 6);
        Cone cone = new Cone(3, 5);
        Sphere sphere = new Sphere(4);

        // Displaying information about each shape
        rectangle.displayShapeName();
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
        System.out.println();

        square.displayShapeName();
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());
        System.out.println();

        circle.displayShapeName();
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());
        System.out.println();

        triangle.displayShapeName();
        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println();

        cube.displayShapeName();
        System.out.println("Volume: " + cube.getVolume());
        System.out.println("Surface Area: " + cube.getSurfaceArea());
        System.out.println();

        cylinder.displayShapeName();
        System.out.println("Volume: " + cylinder.getVolume());
        System.out.println("Surface Area: " + cylinder.getSurfaceArea());
        System.out.println();

        cone.displayShapeName();
        System.out.println("Volume: " + cone.getVolume());
        System.out.println("Surface Area: " + cone.getSurfaceArea());
        System.out.println();

        sphere.displayShapeName();
        System.out.println("Volume: " + sphere.getVolume());
        System.out.println("Surface Area: " + sphere.getSurfaceArea());
    }

}
// Abstract class Shape
abstract class Shape {
    abstract void displayShapeName();
}

// Interface TwoDShape
interface TwoDShape {
    void calculateArea();
    void calculatePerimeter();
}

// Interface ThreeDShape
interface ThreeDShape {
    void calculateVolume();
    void calculateSurfaceArea();
}

// Rectangle class
class Rectangle extends Shape implements TwoDShape {
    private double length;
    private double breadth;
    private double area;
    private double perimeter;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Rectangle");
    }

    @Override
    public void calculateArea() {
        area = length * breadth;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * (length + breadth);
    }

    // Getters and Setters
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

// Square class
class Square extends Shape implements TwoDShape {
    private double side;
    private double area;
    private double perimeter;

    public Square(double side) {
        this.side = side;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Square");
    }

    @Override
    public void calculateArea() {
        area = side * side;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 4 * side;
    }

    // Getters and Setters
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

// Circle class
class Circle extends Shape implements TwoDShape {
    private double radius;
    private double area;
    private double perimeter;

    public Circle(double radius) {
        this.radius = radius;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Circle");
    }

    @Override
    public void calculateArea() {
        area = Math.PI * radius * radius;
    }

    @Override
    public void calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
    }

    // Getters and Setters
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

// Triangle class
class Triangle extends Shape implements TwoDShape {
    private double side1;
    private double side2;
    private double side3;
    private double area;
    private double perimeter;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        calculateArea();
        calculatePerimeter();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Triangle");
    }

    @Override
    public void calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public void calculatePerimeter() {
        perimeter = side1 + side2 + side3;
    }

    // Getters and Setters
    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

// Cube class
class Cube extends Shape implements ThreeDShape {
    private double side;
    private double volume;
    private double surfaceArea;

    public Cube(double side) {
        this.side = side;
        calculateVolume();
        calculateSurfaceArea();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Cube");
    }

    @Override
    public void calculateVolume() {
        volume = Math.pow(side, 3);
    }

    @Override
    public void calculateSurfaceArea() {
        surfaceArea = 6 * Math.pow(side, 2);
    }

    // Getters and Setters
    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}

// Cylinder class
class Cylinder extends Shape implements ThreeDShape {
    private double radius;
    private double height;
    private double volume;
    private double surfaceArea;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        calculateVolume();
        calculateSurfaceArea();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Cylinder");
    }

    @Override
    public void calculateVolume() {
        volume = Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public void calculateSurfaceArea() {
        surfaceArea = 2 * Math.PI * radius * (radius + height);
    }

    // Getters and Setters
    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}

// Cone class
class Cone extends Shape implements ThreeDShape {
    private double radius;
    private double height;
    private double volume;
    private double surfaceArea;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
        calculateVolume();
        calculateSurfaceArea();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Cone");
    }

    @Override
    public void calculateVolume() {
        volume = (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    @Override
    public void calculateSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        surfaceArea = Math.PI * radius * (radius + slantHeight);
    }

    // Getters and Setters
    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}

// Sphere class
class Sphere extends Shape implements ThreeDShape {
    private double radius;
    private double volume;
    private double surfaceArea;

    public Sphere(double radius) {
        this.radius = radius;
        calculateVolume();
        calculateSurfaceArea();
    }

    @Override
    void displayShapeName() {
        System.out.println("Shape: Sphere");
    }

    @Override
    public void calculateVolume() {
        volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public void calculateSurfaceArea() {
        surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
    }

    // Getters and Setters
    public double getVolume() {
        return volume;
    }

    public double getSurfaceArea() {
        return surfaceArea;
    }
}

