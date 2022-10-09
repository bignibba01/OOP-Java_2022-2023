package it.unibo.shapes.impl;

import it.unibo.shapes.api.Polygon;

public class Triangle implements Polygon {
    private final int NUM_EDGES = 3;
    private final double edge1;
    private final double edge2;
    private final double edge3;

    public Square(double edge1, double edge2, double edge3) {
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    public int getNUM_EDGES() {
        return this.NUM_EDGES;
    }
    
    public double calcPerimeter() {
        return (this.getEdge1() + this.getEdge2() + THIS.getEdge3());
    }
    //FINISCI
    public double calcSurface() {
        return (this.getEdge() * this.getEdge());
    }

    public double getEdge1() {
        return this.edge1;
    }

    public double getEdge2() {
        return this.edge2;
    }

    public double getEdge3() {
        return this.edge3;
    }
}