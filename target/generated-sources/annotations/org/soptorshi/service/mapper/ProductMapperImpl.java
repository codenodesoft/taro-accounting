package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.service.dto.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public List<Product> toEntity(List<ProductDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Product> list = new ArrayList<Product>( dtoList.size() );
        for ( ProductDTO productDTO : dtoList ) {
            list.add( toEntity( productDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductDTO> toDto(List<Product> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductDTO> list = new ArrayList<ProductDTO>( entityList.size() );
        for ( Product product : entityList ) {
            list.add( toDto( product ) );
        }

        return list;
    }

    @Override
    public ProductDTO toDto(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();

        Long id = productProductCategoryId( product );
        if ( id != null ) {
            productDTO.setProductCategoryId( id );
        }
        String name = productProductCategoryName( product );
        if ( name != null ) {
            productDTO.setProductCategoryName( name );
        }
        productDTO.setId( product.getId() );
        productDTO.setName( product.getName() );
        productDTO.setDescription( product.getDescription() );
        productDTO.setCountryOrOrigin( product.getCountryOrOrigin() );
        productDTO.setStatus( product.getStatus() );
        productDTO.setModifiedBy( product.getModifiedBy() );
        productDTO.setModifiedOn( product.getModifiedOn() );
        productDTO.setScientificName( product.getScientificName() );

        return productDTO;
    }

    @Override
    public Product toEntity(ProductDTO productDTO) {
        if ( productDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setProductCategory( productCategoryMapper.fromId( productDTO.getProductCategoryId() ) );
        product.setId( productDTO.getId() );
        product.setName( productDTO.getName() );
        product.setDescription( productDTO.getDescription() );
        product.setCountryOrOrigin( productDTO.getCountryOrOrigin() );
        product.setStatus( productDTO.getStatus() );
        product.setModifiedBy( productDTO.getModifiedBy() );
        product.setModifiedOn( productDTO.getModifiedOn() );
        product.setScientificName( productDTO.getScientificName() );

        return product;
    }

    private Long productProductCategoryId(Product product) {
        if ( product == null ) {
            return null;
        }
        ProductCategory productCategory = product.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        Long id = productCategory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String productProductCategoryName(Product product) {
        if ( product == null ) {
            return null;
        }
        ProductCategory productCategory = product.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        String name = productCategory.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
