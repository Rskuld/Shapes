package aproximacionPolimorfismo;

public class Rectangle implements Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double area() {
        return height * width;
    }

    @Override
    public double areaSubtract(Shape otherShape) {
        return otherShape.areaSubtract(this.area());
    }

    public double areaSubtract(double area) {
        return this.area() - area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                '}';
    }
}