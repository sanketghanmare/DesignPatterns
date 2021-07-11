package com.sk101.iterator.exercise;

public class Main {
    public static void main(String[] args) {
        var collection = new ProductCollection();

        var prod1 = new Product(1, "Macbook");
        var prod2 = new Product(2, "Mobile");
        var prod3 = new Product(3, "Books");
        var prod4 = new Product(4, "Food");

        collection.add(prod1);
        collection.add(prod2);
        collection.add(prod3);
        collection.add(prod4);

        var prodIterator = collection.createIterator();
        while (prodIterator.hasNext()) {
            var product = prodIterator.current();
            System.out.println(product);
            prodIterator.next();
        }
    }
}
