package m8;

import java.util.Arrays;

public class ShapeTest {
    public static void main(String[] args) {
        Quad quad=new Quad();
        Circle circle=new Circle();
        Triangle triangle=new Triangle();
        Rectangle rectangle=new Rectangle();
        Trapezoid trapezoid=new Trapezoid();
        Shape []names = new Shape[]{quad,circle,triangle,rectangle,trapezoid};
        for (Shape name : names) {
            name.haveShapeName();
        }

        }
    }
