import java.util.Scanner;

public class Solution {
    //any changes required are made here
    public Shape WhatShapeIsIt(String ShapeName){
        switch(ShapeName){
            case "Circle": Circle circle = new Circle();
                            return circle;
            case "Square": Square square = new Square();
                            return square;
            default: Rectangle rectangle = new Rectangle() ;
                            return rectangle;
        }
    }

    //calls the draw function
    public String Draw(Shape shape){
        return shape.Draw();
    }


    public String GetAllDrawings(String[] ShapesList){
        String Drawing="";
        for(int i=0; i<ShapesList.length; i++){
            Shape shape = this.WhatShapeIsIt(ShapesList[i]);
            Drawing += this.Draw(shape);
        }

        return Drawing;
    }





}
