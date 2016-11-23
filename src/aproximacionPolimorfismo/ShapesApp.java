package aproximacionPolimorfismo;

/**
 * Created by nuriagomez on 08/11/16.
 */
public class ShapesApp {

    public static void main(String[] args) {
        ShapesCalculator shapesCalculator = new ShapesCalculator();
        System.out.println(shapesCalculator.toString());
        Shape circle = new Circle(20);
        Shape similarShape = shapesCalculator.similarArea(circle);
        System.out.println(similarShape.toString());
    }
}
