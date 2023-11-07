// Cube extends Square and implements ThreeD
public class Cube extends Square implements ThreeD {
    public Cube() {
        super();
    }

    public Cube(double side) {
        super(side);
    }

    @Override
    public double getVolume() {
        return Math.pow(getSide(), 3);
    }
}

