package aproximacionPolimorfismo;

/**
 * Created by nuriagomez on 07/11/16.
 */
public interface Shape {
    double area();
    double areaSubtract(Shape otherShape);
    double areaSubtract(double area); //en este caso no hace falta pero...
}
