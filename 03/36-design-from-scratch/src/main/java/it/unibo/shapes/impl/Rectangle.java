package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Rectangle implements Polygon {
    private final int NUM_EDGES = 4;
    private final double base;
    private final double height;

    public Rectangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double calcPerimeter() {
        return (this.getBase() * 2 + this.getHeight() * 2);
    }

    public double calcSurface() {
        return (this.getBase() * this.getHeight());
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public int getEdgeCount() {
        return this.NUM_EDGES;
    }
}