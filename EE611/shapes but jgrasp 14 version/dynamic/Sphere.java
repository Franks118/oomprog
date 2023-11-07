// Sphere extends Circle and implements ThreeD
public class Sphere extends Circle implements ThreeD {
    public Sphere() {
        super();
    }

    public Sphere(double radius) {
        super(radius);
    }

    @Override
    public double getVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(getRadius(), 3);
    }
}

