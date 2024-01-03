package exercises;


public class JavaExerciseTwo_QuesTwo {
    public static void main(String[] args) {
        QuesTwoSquare square = new QuesTwoSquare(5);
        QuesTwoTriangle triangle = new QuesTwoTriangle(3, 4, 5);

        square.numberOfSides();
        square.calculatePerimeter();

        System.out.println();

        triangle.numberOfSides();
        triangle.calculatePerimeter();
    }
}
// Interface TwoDShape
interface QuesTwoTwoDShape {
    void calculatePerimeter();
    void numberOfSides();
}

// Concrete class representing a square
class QuesTwoSquare implements QuesTwoTwoDShape {
    double side;

    QuesTwoSquare(double side) {
        this.side = side;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 4 * side;
        System.out.println("Perimeter of Square: " + perimeter);
    }

    @Override
    public void numberOfSides() {
        System.out.println("Number of sides of Square: 4");
    }
}

// Concrete class representing a triangle
class QuesTwoTriangle implements QuesTwoTwoDShape {
    double side1, side2, side3;

    QuesTwoTriangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter of Triangle: " + perimeter);
    }

    @Override
    public void numberOfSides() {
        System.out.println("Number of sides of Triangle: 3");
    }
}
