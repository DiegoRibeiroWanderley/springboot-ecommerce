package com.ecommerce.project.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
    private Long productId;

    @NotBlank(message = "Must not be blank")
    @Size(min = 3, message = "Product name must contain at least 3 characters")
    private String productName;

    private String image;

    @NotBlank(message = "Must not be blank")
    @Size(min = 6, message = "Product name must contain at least 6 characters")
    private String description;

    private Integer quantity;
    public Double price;
    private Double discount;
    public Double specialPrice;
}
