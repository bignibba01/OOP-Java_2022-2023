package it.unibo.shapes.test;

import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {

    public static void main(String[] args) {
        Circle c = new Circle(2.5);
        Rectangle r = new Rectangle(2, 5);
        Square s = new Square(3);
        Triangle t = new Triangle(2, 4, 1.5, 2.7);

        System.out.println(c.toString());
        System.out.println(r.toString());
        System.out.println(s.toString());
        System.out.println(t.toString());
    }

}