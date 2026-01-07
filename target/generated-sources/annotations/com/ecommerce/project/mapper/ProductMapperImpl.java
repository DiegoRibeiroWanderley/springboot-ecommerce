package com.ecommerce.project.mapper;

import com.ecommerce.project.model.Product;
import com.ecommerce.project.payload.ProductDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-06T17:28:44-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 17.0.17 (Microsoft)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductDTO toDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        productDTO.setProductId( product.getProductId() );
        productDTO.setProductName( product.getProductName() );
        productDTO.setImage( product.getImage() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setQuantity( product.getQuantity() );
        productDTO.setPrice( product.getPrice() );
        productDTO.setDiscount( product.getDiscount() );
        productDTO.setSpecialPrice( product.getSpecialPrice() );

        return productDTO;
    }

    @Override
    public Product toEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductId( productDTO.getProductId() );
        product.setProductName( productDTO.getProductName() );
        product.setImage( productDTO.getImage() );
        product.setDescription( productDTO.getDescription() );
        product.setQuantity( productDTO.getQuantity() );
        product.setPrice( productDTO.getPrice() );
        product.setDiscount( productDTO.getDiscount() );
        product.setSpecialPrice( productDTO.getSpecialPrice() );

        return product;
    }

    @Override
    public List<ProductDTO> toDTOs(List<Product> products) {
        if ( products == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( products.size() );
        for ( Product product : products ) {
            list.add( toDTO( product ) );
        }

        return list;
    }
}
