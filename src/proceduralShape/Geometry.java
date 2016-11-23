package proceduralShape;

public class Geometry {
    public final double PI = 3.141592653589793;

    public double area(Object shape) {
        double result = 0;
        if (shape instanceof Square) {
            Square s = (Square) shape;
            result= s.getSide() * s.getSide();
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            result= r.getHeight() * r.getWidth();
        } else if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            result= PI * c.getRadius() * c.getRadius();
        }
        //y si tenemos 100 formas...
        //comparar dos áreas...
        return result;
    }

    }