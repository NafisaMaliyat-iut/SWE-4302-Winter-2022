import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class ShapeTest {
    @Test
    void DrawShapes1(){
        String expected = "Drawing Circle\n" +
                    "Drawing Square\n" + "Drawing Square\n" + "Drawing Circle\n" +
                    "Drawing Square\n" + "Drawing Square\n" + "Drawing Circle\n";

        Solution solution = new Solution();
        String[] ShapesList = new String[7];
        ShapesList[0] = "Circle";
        ShapesList[1] = "Square";
        ShapesList[2] = "Square";
        ShapesList[3] = "Circle";
        ShapesList[4] = "Square";
        ShapesList[5] = "Square";
        ShapesList[6] = "Circle";

        assertEquals(expected, solution.GetAllDrawings(ShapesList));
    }


    @Test
    void DrawShapes2(){
        String expected = "Drawing Circle\n"+ "Drawing Rectangle\n"+ "Drawing Rectangle\n"+
                    "Drawing Square\n" + "Drawing Circle\n" + "Drawing Rectangle\n" +
                    "Drawing Circle\n" + "Drawing Square\n" + "Drawing Rectangle\n" +
                    "Drawing Circle\n" + "Drawing Square\n" + "Drawing Square\n";

        //what the solution will be doing
        Solution solution = new Solution();
        String[] ShapesList = new String[12];
        ShapesList[0] = "Circle";
        ShapesList[1] = "Rectangle";
        ShapesList[2] = "Rectangle";
        ShapesList[3] = "Square";
        ShapesList[4] = "Circle";
        ShapesList[5] = "Rectangle";
        ShapesList[6] = "Circle";
        ShapesList[7] = "Square";
        ShapesList[8] = "Rectangle";
        ShapesList[9] = "Circle";
        ShapesList[10] = "Square";
        ShapesList[11] = "Square";

        assertEquals(expected, solution.GetAllDrawings(ShapesList));
    }

}
