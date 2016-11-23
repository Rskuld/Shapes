package aproximacionPolimorfismo;

public class Circle implements Shape {

private double radius;
public final double PI = 3.141592653589793;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
return PI * radius * radius;
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
        return "Circle{" +
                "radius=" + radius +
                ", PI=" + PI +
                '}';
    }
}