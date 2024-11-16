package org.example;

import java.util.ArrayList;
import java.util.List;

public class ProductsName {
    public static List<Product> productList = new ArrayList<Product>();

    static {
        productList.add(new Product("Tomato", 55.50, true));
        productList.add(new Product("Сucumber", 48.50, false));
        productList.add(new Product("Potato", 80.50, true));
        productList.add(new Product("Bananas", 99.50, false));
        productList.add(new Product("Kiwi", 320.00, true));
        productList.add(new Product("Grape", 500.10, false));
        productList.add(new Product("apples", 55.50, true));
        productList.add(new Product("Peaches", 77.50, false));
        productList.add(new Product("Apricots", 89.50, true));
        productList.add(new Product("Cherry", 450.66, false));

    }
}
