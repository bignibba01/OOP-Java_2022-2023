package it.unibo.shapes.impl;

import java.lang.Math;

public class Circle implements it.unibo.shapes.api.Shape {
    private double radix;

    public double getRadix() {
        return this.radix;
    }

    public double calcPerimeter() {
        return (2 * Math.PI * this.getRadix());
    }

    public double calcSurface() {
        return (Math.PI * (Math.pow(this.getRadix(), 2.0)));
    }

}