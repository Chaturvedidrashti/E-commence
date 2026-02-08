//package com.example.demo.model;
//
//public class Item {
//}
package com.example.demo.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class Item {

    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Description is required")
    private String description;

    @NotNull(message = "Price is required")
    private Double price;

    public Item() {
    }

    public Item(Long id, String name, String description, Double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public void setId(Long aLong) {
    }

    public Object getId() {
        return null;
    }
//
//    public Object getId() {
//    }

    // Getters & Setters
}