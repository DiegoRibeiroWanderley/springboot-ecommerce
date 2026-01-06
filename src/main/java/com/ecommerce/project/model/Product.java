package com.ecommerce.project.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;

    @NotBlank(message = "Must not be blank")
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;

    private String image;

    @NotBlank(message = "Must not be blank")
    @Size(min = 10, message = "Product name must contain at least 10 characters")
    private String description;

    private Integer quantity;
    public Double price;
    private Double discount;
    public Double specialPrice;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name = "seller_id")
    private User user;
}
