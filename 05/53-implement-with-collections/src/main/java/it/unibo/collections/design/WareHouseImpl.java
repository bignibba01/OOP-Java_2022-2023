package it.unibo.collections.design;

import java.util.Set;
import java.util.LinkedHashSet;
import it.unibo.collections.design.api.Product;
import it.unibo.collections.design.api.Warehouse;

public class WareHouseImpl implements Warehouse {

    private final Set<Product> linkedHashList = new LinkedHashSet<>();

    public WareHouseImpl() {

    }

    public void addProduct(final Product p) {
        this.linkedHashList.add(p);
    }

    public Set<String> allNames() {
        final Set<String> set = new LinkedHashSet<>();
        for (final Product p: this.linkedHashList) {
            set.add(p.getName());
        }
        return set;
    }

    public Set<Product> allProducts() {
        return new LinkedHashSet<>(this.linkedHashList);
    }

    public final boolean containsProduct(Product p) {
        return linkedHashList.contains(p);
    }

    public final double getQuantity(String name) {
        for (final Product p: this.linkedHashList) {
            if (p.getName().equals(name)) {
                return p.getQuantity();
            }
        }
        return 0;
    }

}
