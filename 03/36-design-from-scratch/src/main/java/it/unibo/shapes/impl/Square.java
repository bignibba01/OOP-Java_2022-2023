package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Square implements Polygon {
    private final int NUM_EDGES = 4;
    private final double edge;

    public Square(double edge) {
        this.edge = edge;
    }
    
    public double calcPerimeter() {
        return (this.getEdge() * 4);
    }

    public double calcSurface() {
        return (this.getEdge() * this.getEdge());
    }

    public double getEdge() {
        return this.edge;
    }

    public int getEdgeCount() {
        return this.NUM_EDGES;
    }
}