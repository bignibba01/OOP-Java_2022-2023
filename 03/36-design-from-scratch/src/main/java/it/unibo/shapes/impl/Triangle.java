package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon {
    private final int NUM_EDGES = 3;
    private final double base;
    private final double height;
    private final double edge1;
    private final double edge2;

    public Triangle(double base, double height, double edge1, double edge2) {
        this.base = base;
        this.height = height;
        this.edge1 = edge1;
        this.edge2 = edge2;
    }

    public int getEdgeCount() {
        return this.NUM_EDGES;
    }
    
    public double calcPerimeter() {
        return (this.getEdge1() + this.getEdge2() + this.getBase());
    }
    //FINISCI
    public double calcSurface() {
        return (this.getBase() * this.getHeight() / 2);
    }

    public double getEdge1() {
        return this.edge1;
    }

    public double getEdge2() {
        return this.edge2;
    }

    public double getBase() {
        return this.base;
    }

    public double getHeight() {
        return this.height;
    }

    public String toString() {
        return "Triangle -> Base: " + this.getBase() + ", Height: " + this.getHeight()
            + ", Edge1: " + this.getEdge1() + ", Edge2: " + this.getEdge2() + ", Surface: "
            + this.calcSurface() + ", Perimeter: " + this.calcPerimeter();
    }

}