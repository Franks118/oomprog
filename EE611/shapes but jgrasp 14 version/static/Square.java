// Square extends Shape
public class Square extends Shape {
    private double side;

    public Square() {
        this.side = 0.0;
    }

    public Square(double side) {
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public String toString() {
        return "Square with side: " + side;
    }

    public boolean equals(Square s) {
        return this.side == s.side;
    }
}

