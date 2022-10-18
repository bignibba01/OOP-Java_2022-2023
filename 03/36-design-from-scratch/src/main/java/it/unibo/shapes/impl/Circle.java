package it.unibo.shapes.impl;

import java.lang.Math;

public class Circle implements it.unibo.shapes.api.Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double calcPerimeter() {
        return (2 * Math.PI * this.getRadius());
    }

    public double calcSurface() {
        return (Math.PI * (Math.pow(this.getRadius(), 2.0)));
    }

    public String toString() {
        return "CIRCLE -> Radius: " + this.getRadius() + ", Surface: " + this.calcSurface()
            + ", Circumference: " + this.calcPerimeter();
    }

}