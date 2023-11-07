public class TestShapes {
    public static void main(String[] args) {
        // Testing Square
        Square square1 = new Square(5);
        System.out.println("Square 1: " + square1);
        System.out.println("Area of Square 1: " + square1.getArea());

        Square square2 = new Square(4);
        System.out.println("Square 2: " + square2);
        System.out.println("Area of Square 2: " + square2.getArea());

        System.out.println("Are Square 1 and Square 2 equal? " + square1.equals(square2));

        // Testing Cube
        Cube cube1 = new Cube(3);
        System.out.println("Cube 1: " + cube1);
        System.out.println("Volume of Cube 1: " + cube1.getVolume());

        Cube cube2 = new Cube(4);
        System.out.println("Cube 2: " + cube2);
        System.out.println("Volume of Cube 2: " + cube2.getVolume());

        // Testing Circle
        Circle circle1 = new Circle(2);
        System.out.println("Circle 1: " + circle1);
        System.out.println("Area of Circle 1: " + circle1.getArea());

        Circle circle2 = new Circle(3);
        System.out.println("Circle 2: " + circle2);
        System.out.println("Area of Circle 2: " + circle2.getArea());

        System.out.println("Are Circle 1 and Circle 2 equal? " + circle1.equals(circle2));

        // Testing Sphere
        Sphere sphere1 = new Sphere(2);
        System.out.println("Sphere 1: " + sphere1);
        System.out.println("Volume of Sphere 1: " + sphere1.getVolume());

        Sphere sphere2 = new Sphere(3);
        System.out.println("Sphere 2: " + sphere2);
        System.out.println("Volume of Sphere 2: " + sphere2.getVolume());

        // Testing Cylinder
        Cylinder cylinder1 = new Cylinder(2, 4);
        System.out.println("Cylinder 1: " + cylinder1);
        System.out.println("Volume of Cylinder 1: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(3, 5);
        System.out.println("Cylinder 2: " + cylinder2);
        System.out.println("Volume of Cylinder 2: " + cylinder2.getVolume());
    }
}
