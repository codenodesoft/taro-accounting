package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductPrice;
import org.soptorshi.service.dto.ProductPriceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ProductPriceMapperImpl implements ProductPriceMapper {

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<ProductPrice> toEntity(List<ProductPriceDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ProductPrice> list = new ArrayList<ProductPrice>( dtoList.size() );
        for ( ProductPriceDTO productPriceDTO : dtoList ) {
            list.add( toEntity( productPriceDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductPriceDTO> toDto(List<ProductPrice> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductPriceDTO> list = new ArrayList<ProductPriceDTO>( entityList.size() );
        for ( ProductPrice productPrice : entityList ) {
            list.add( toDto( productPrice ) );
        }

        return list;
    }

    @Override
    public ProductPriceDTO toDto(ProductPrice productPrice) {
        if ( productPrice == null ) {
            return null;
        }

        ProductPriceDTO productPriceDTO = new ProductPriceDTO();

        Long id = productPriceProductId( productPrice );
        if ( id != null ) {
            productPriceDTO.setProductId( id );
        }
        String name = productPriceProductName( productPrice );
        if ( name != null ) {
            productPriceDTO.setProductName( name );
        }
        productPriceDTO.setId( productPrice.getId() );
        productPriceDTO.setPrice( productPrice.getPrice() );
        productPriceDTO.setPriceDate( productPrice.getPriceDate() );
        productPriceDTO.setModifiedBy( productPrice.getModifiedBy() );
        productPriceDTO.setModifiedOn( productPrice.getModifiedOn() );

        return productPriceDTO;
    }

    @Override
    public ProductPrice toEntity(ProductPriceDTO productPriceDTO) {
        if ( productPriceDTO == null ) {
            return null;
        }

        ProductPrice productPrice = new ProductPrice();

        productPrice.setProduct( productMapper.fromId( productPriceDTO.getProductId() ) );
        productPrice.setId( productPriceDTO.getId() );
        productPrice.setPrice( productPriceDTO.getPrice() );
        productPrice.setPriceDate( productPriceDTO.getPriceDate() );
        productPrice.setModifiedBy( productPriceDTO.getModifiedBy() );
        productPrice.setModifiedOn( productPriceDTO.getModifiedOn() );

        return productPrice;
    }

    private Long productPriceProductId(ProductPrice productPrice) {
        if ( productPrice == null ) {
            return null;
        }
        Product product = productPrice.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String productPriceProductName(ProductPrice productPrice) {
        if ( productPrice == null ) {
            return null;
        }
        Product product = productPrice.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
