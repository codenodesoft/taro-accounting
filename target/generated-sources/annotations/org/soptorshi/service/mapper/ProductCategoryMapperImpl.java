package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.service.dto.ProductCategoryDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ProductCategoryMapperImpl implements ProductCategoryMapper {

    @Override
    public ProductCategory toEntity(ProductCategoryDTO dto) {
        if ( dto == null ) {
            return null;
        }

        ProductCategory productCategory = new ProductCategory();

        productCategory.setId( dto.getId() );
        productCategory.setName( dto.getName() );
        productCategory.setDescription( dto.getDescription() );
        productCategory.setModifiedBy( dto.getModifiedBy() );
        productCategory.setModifiedOn( dto.getModifiedOn() );

        return productCategory;
    }

    @Override
    public ProductCategoryDTO toDto(ProductCategory entity) {
        if ( entity == null ) {
            return null;
        }

        ProductCategoryDTO productCategoryDTO = new ProductCategoryDTO();

        productCategoryDTO.setId( entity.getId() );
        productCategoryDTO.setName( entity.getName() );
        productCategoryDTO.setDescription( entity.getDescription() );
        productCategoryDTO.setModifiedBy( entity.getModifiedBy() );
        productCategoryDTO.setModifiedOn( entity.getModifiedOn() );

        return productCategoryDTO;
    }

    @Override
    public List<ProductCategory> toEntity(List<ProductCategoryDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ProductCategory> list = new ArrayList<ProductCategory>( dtoList.size() );
        for ( ProductCategoryDTO productCategoryDTO : dtoList ) {
            list.add( toEntity( productCategoryDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductCategoryDTO> toDto(List<ProductCategory> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductCategoryDTO> list = new ArrayList<ProductCategoryDTO>( entityList.size() );
        for ( ProductCategory productCategory : entityList ) {
            list.add( toDto( productCategory ) );
        }

        return list;
    }
}
