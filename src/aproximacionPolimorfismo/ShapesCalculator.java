package aproximacionPolimorfismo;

import java.util.ArrayList;

/**
 * Created by nuriagomez on 07/11/16.
 */
public class ShapesCalculator extends ArrayList <Shape> {

    public ShapesCalculator() {
        for (int i = 0; i < 100; i++) {
            int ramdomShapeGenerator= (int)(Math.random()*3.0);
            Shape ramdomShape;
            if(ramdomShapeGenerator ==0)
                ramdomShape =this.generateRectangle();

            else if(ramdomShapeGenerator ==1)
                ramdomShape = this.generateCircle();

            else
                ramdomShape = this.generateSquare();

            this.add(ramdomShape);
        }
    }

    private Shape generateSquare() {
        double ramdomSide = Math.random()*20.0;
         return new Square(ramdomSide);
    }

    private Shape generateCircle() {
        double ramdomRadius= Math.random()*20.0;
        return new Circle(ramdomRadius);
    }

    private Shape generateRectangle() {
        double ramdomHeight = Math.random()*20.0;
        double ramdomWidth =Math.random()*20.0;
        return new Rectangle(ramdomHeight,ramdomWidth);
    }

    public Shape similarArea(Shape otherShape){
        Shape result = null;
        double lessDifferentArea = otherShape.area();
        for (Shape shape:this) {
            double actualArea =shape.areaSubtract(otherShape);
            if(actualArea<lessDifferentArea){
                lessDifferentArea = actualArea;
                result = shape;
            }
        }
        return result;
    }

    @Override
    public String toString() {
        return "ShapesCalculator{} " + super.toString();
    }
}
