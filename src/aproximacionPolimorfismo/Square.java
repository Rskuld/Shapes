package aproximacionPolimorfismo;

public class Square implements Shape {
private double side;

    public Square(double side) {
        this.side = side;
    }

    public double area() {
return side*side;
}

    @Override
    public double areaSubtract(Shape otherShape) {
        return otherShape.areaSubtract(this.area());
    }

    @Override
    public double areaSubtract(double area) {
        return this.area()-area;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                '}';
    }
}