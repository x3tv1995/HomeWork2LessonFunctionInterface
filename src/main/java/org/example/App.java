package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        //Задача 1 написать метод с использованием предиката,который будет возвращать новый список продуктов, прошедших по условию.
        List<Product> priceUnder300 = printSelection(ProductsName.productList, name -> name.getPrice() < 300);
        List<Product> productsNoAvailable = printSelection(ProductsName.productList, name -> !name.isAvailable());
        List<Product> productsWithA = printSelection(ProductsName.productList, name -> name.getName().toUpperCase().startsWith("A"));


        //Задача 2  Написать метод. Он принимает лист продуктов и вернет лист других типов (Лист цен, лист  названий)
        List<Double> printListPrice = printList(ProductsName.productList, name -> name.getPrice());
        List<String> printListName = printList(ProductsName.productList, name -> name.getName());


        //Задача 3 Метод просто возвращает новый лист с объектами продукт пустыми.
        List<Product> newProducts = newProduct(5,Product::new);
        newProducts.forEach(System.out::println);

    }

    public static List<Product> printSelection(List<Product> products, Predicate<Product> predicate) {
        List<Product> filteredProducts = new ArrayList<Product>();
        for (Product product : products) {
            if (predicate.test(product)) {
                filteredProducts.add(product);
            }
        }
        return filteredProducts;
    }

    public static <R> List<R> printList(List<Product> products, Function<Product, R> predicate) {
        List<R> filteredProducts = new ArrayList<>();
        for (Product product : products) {
            filteredProducts.add(predicate.apply(product));
        }
        return filteredProducts;
    }

    public static List<Product> newProduct(int count, Supplier<Product> supplier) {
        List<Product> filteredProducts = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            filteredProducts.add(supplier.get());
        }
        return filteredProducts;
    }
}
