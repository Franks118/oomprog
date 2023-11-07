import java.util.*;
public class TestShapesWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Square
        System.out.print("Enter the side length of Square 1: ");
        double square1Side = scanner.nextDouble();
        Square square1 = new Square(square1Side);

        System.out.print("Enter the side length of Square 2: ");
        double square2Side = scanner.nextDouble();
        Square square2 = new Square(square2Side);

        System.out.println("Square 1: " + square1);
        System.out.println("Area of Square 1: " + square1.getArea());

        System.out.println("Square 2: " + square2);
        System.out.println("Area of Square 2: " + square2.getArea());
        System.out.println("Are Square 1 and Square 2 equal? " + square1.equals(square2));

        // Input for Cube
        System.out.print("Enter the side length of Cube 1: ");
        double cube1Side = scanner.nextDouble();
        Cube cube1 = new Cube(cube1Side);

        System.out.print("Enter the side length of Cube 2: ");
        double cube2Side = scanner.nextDouble();
        Cube cube2 = new Cube(cube2Side);

        System.out.println("Cube 1: " + cube1);
        System.out.println("Volume of Cube 1: " + cube1.getVolume());

        System.out.println("Cube 2: " + cube2);
        System.out.println("Volume of Cube 2: " + cube2.getVolume());

        // Input for Circle
        System.out.print("Enter the radius of Circle 1: ");
        double circle1Radius = scanner.nextDouble();
        Circle circle1 = new Circle(circle1Radius);

        System.out.print("Enter the radius of Circle 2: ");
        double circle2Radius = scanner.nextDouble();
        Circle circle2 = new Circle(circle2Radius);

        System.out.println("Circle 1: " + circle1);
        System.out.println("Area of Circle 1: " + circle1.getArea());

        System.out.println("Circle 2: " + circle2);
        System.out.println("Area of Circle 2: " + circle2.getArea());
        System.out.println("Are Circle 1 and Circle 2 equal? " + circle1.equals(circle2));

        // Input for Sphere
        System.out.print("Enter the radius of Sphere 1: ");
        double sphere1Radius = scanner.nextDouble();
        Sphere sphere1 = new Sphere(sphere1Radius);

        System.out.print("Enter the radius of Sphere 2: ");
        double sphere2Radius = scanner.nextDouble();
        Sphere sphere2 = new Sphere(sphere2Radius);

        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Volume of Sphere 1: " + sphere1.getVolume());

        System.out.println("Sphere 2: " + sphere2);
        System.out.println("Volume of Sphere 2: " + sphere2.getVolume());

        // Input for Cylinder
        System.out.print("Enter the radius of Cylinder 1: ");
        double cylinder1Radius = scanner.nextDouble();

        System.out.print("Enter the height of Cylinder 1: ");
        double cylinder1Height = scanner.nextDouble();
        Cylinder cylinder1 = new Cylinder(cylinder1Radius, cylinder1Height);

        System.out.print("Enter the radius of Cylinder 2: ");
        double cylinder2Radius = scanner.nextDouble();

        System.out.print("Enter the height of Cylinder 2: ");
        double cylinder2Height = scanner.nextDouble();
        Cylinder cylinder2 = new Cylinder(cylinder2Radius, cylinder2Height);

        System.out.println("Cylinder 1: " + cylinder1);
        System.out.println("Volume of Cylinder 1: " + cylinder1.getVolume());

        System.out.println("Cylinder 2: " + cylinder2);
        System.out.println("Volume of Cylinder 2: " + cylinder2.getVolume());

        // Close the scanner
        scanner.close();
    }
}
