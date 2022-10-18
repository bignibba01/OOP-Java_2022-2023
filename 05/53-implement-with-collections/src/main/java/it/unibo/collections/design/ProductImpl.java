package it.unibo.collections.design;

import it.unibo.collections.design.api.Product;

public class ProductImpl implements Product {

    private final String name;
    private final double quantity;

    public ProductImpl(final String name, final double d) {
        this.name = name;
        this.quantity = d;
    }

    public String getName() {
        return this.name;
    }

    public double getQuantity() {
        return this.quantity;
    }
    
}