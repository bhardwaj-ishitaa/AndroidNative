package exercises;

public class JavaExerciseTwo_QuesThree {
    public static void main(String[] args) {
        QuesThreeSphere sphere = new QuesThreeSphere(3);
        QuesThreeCube cube = new QuesThreeCube(4);

        sphere.calculateVolume();
        sphere.calculateSurfaceArea();

        System.out.println();

        cube.calculateVolume();
        cube.calculateSurfaceArea();
    }
}
// Interface ThreeDShape
interface QuesThreeThreeDShape {
    void calculateVolume();
    void calculateSurfaceArea();
}

// Concrete class representing a sphere
class QuesThreeSphere implements QuesThreeThreeDShape {
    double radius;

    QuesThreeSphere(double radius) {
        this.radius = radius;
    }

    @Override
    public void calculateVolume() {
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        System.out.println("Volume of Sphere: " + volume);
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 4 * Math.PI * Math.pow(radius, 2);
        System.out.println("Surface Area of Sphere: " + surfaceArea);
    }
}

// Concrete class representing a cube
class QuesThreeCube implements QuesThreeThreeDShape {
    double side;

    QuesThreeCube(double side) {
        this.side = side;
    }

    @Override
    public void calculateVolume() {
        double volume = Math.pow(side, 3);
        System.out.println("Volume of Cube: " + volume);
    }

    @Override
    public void calculateSurfaceArea() {
        double surfaceArea = 6 * Math.pow(side, 2);
        System.out.println("Surface Area of Cube: " + surfaceArea);
    }
}

