package com.sk101.iterator.exercise;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {

    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private final ProductCollection productsCollection;
        private int index;

        public ListIterator(ProductCollection prod) {
            this.productsCollection = prod;
        }

        @Override
        public boolean hasNext() {
            return (index < productsCollection.products.size());
        }

        @Override
        public Object current() {
            return productsCollection.products.get(index);
        }

        @Override
        public void next() {
            index++;
        }
    }
}
