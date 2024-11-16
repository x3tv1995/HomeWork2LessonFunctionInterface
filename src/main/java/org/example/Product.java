package org.example;

import lombok.*;

@Data
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Getter
@Setter

public class Product {
    private String name;
    private double price;
    private boolean available;


    public Product() {

    }
}
