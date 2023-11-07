// Cylinder extends Circle and implements ThreeD
public class Cylinder extends Circle implements ThreeD {
    private double height;

    public Cylinder() {
        super();
        this.height = 0.0;
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(getRadius(), 2) * height;
    }
}
