package com.ecommerce.project.mapper;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductDTO toDTO(Product product);
    Product toEntity(ProductDTO productDTO);
    List<ProductDTO> toDTOs(List<Product> products);
}
