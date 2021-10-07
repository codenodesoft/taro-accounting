package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.Production;
import org.soptorshi.domain.Requisition;
import org.soptorshi.service.dto.ProductionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class ProductionMapperImpl implements ProductionMapper {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private RequisitionMapper requisitionMapper;

    @Override
    public List<Production> toEntity(List<ProductionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Production> list = new ArrayList<Production>( dtoList.size() );
        for ( ProductionDTO productionDTO : dtoList ) {
            list.add( toEntity( productionDTO ) );
        }

        return list;
    }

    @Override
    public List<ProductionDTO> toDto(List<Production> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ProductionDTO> list = new ArrayList<ProductionDTO>( entityList.size() );
        for ( Production production : entityList ) {
            list.add( toDto( production ) );
        }

        return list;
    }

    @Override
    public ProductionDTO toDto(Production production) {
        if ( production == null ) {
            return null;
        }

        ProductionDTO productionDTO = new ProductionDTO();

        Long id = productionProductsId( production );
        if ( id != null ) {
            productionDTO.setProductsId( id );
        }
        String requisitionNo = productionRequisitionsRequisitionNo( production );
        if ( requisitionNo != null ) {
            productionDTO.setRequisitionsRequisitionNo( requisitionNo );
        }
        String name = productionProductCategoriesName( production );
        if ( name != null ) {
            productionDTO.setProductCategoriesName( name );
        }
        Long id1 = productionProductCategoriesId( production );
        if ( id1 != null ) {
            productionDTO.setProductCategoriesId( id1 );
        }
        String name1 = productionProductsName( production );
        if ( name1 != null ) {
            productionDTO.setProductsName( name1 );
        }
        Long id2 = productionRequisitionsId( production );
        if ( id2 != null ) {
            productionDTO.setRequisitionsId( id2 );
        }
        productionDTO.setId( production.getId() );
        productionDTO.setWeightStep( production.getWeightStep() );
        productionDTO.setUnit( production.getUnit() );
        productionDTO.setQuantity( production.getQuantity() );
        productionDTO.setByProductDescription( production.getByProductDescription() );
        productionDTO.setByProductQuantity( production.getByProductQuantity() );
        productionDTO.setRemarks( production.getRemarks() );
        productionDTO.setCreatedBy( production.getCreatedBy() );
        productionDTO.setCreatedOn( production.getCreatedOn() );
        productionDTO.setUpdatedBy( production.getUpdatedBy() );
        productionDTO.setUpdatedOn( production.getUpdatedOn() );
        productionDTO.setWastage( production.getWastage() );

        return productionDTO;
    }

    @Override
    public Production toEntity(ProductionDTO productionDTO) {
        if ( productionDTO == null ) {
            return null;
        }

        Production production = new Production();

        production.setProductCategories( productCategoryMapper.fromId( productionDTO.getProductCategoriesId() ) );
        production.setRequisitions( requisitionMapper.fromId( productionDTO.getRequisitionsId() ) );
        production.setProducts( productMapper.fromId( productionDTO.getProductsId() ) );
        production.setId( productionDTO.getId() );
        production.setWeightStep( productionDTO.getWeightStep() );
        production.setUnit( productionDTO.getUnit() );
        production.setQuantity( productionDTO.getQuantity() );
        production.setByProductDescription( productionDTO.getByProductDescription() );
        production.setByProductQuantity( productionDTO.getByProductQuantity() );
        production.setRemarks( productionDTO.getRemarks() );
        production.setCreatedBy( productionDTO.getCreatedBy() );
        production.setCreatedOn( productionDTO.getCreatedOn() );
        production.setUpdatedBy( productionDTO.getUpdatedBy() );
        production.setUpdatedOn( productionDTO.getUpdatedOn() );
        production.setWastage( productionDTO.getWastage() );

        return production;
    }

    private Long productionProductsId(Production production) {
        if ( production == null ) {
            return null;
        }
        Product products = production.getProducts();
        if ( products == null ) {
            return null;
        }
        Long id = products.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String productionRequisitionsRequisitionNo(Production production) {
        if ( production == null ) {
            return null;
        }
        Requisition requisitions = production.getRequisitions();
        if ( requisitions == null ) {
            return null;
        }
        String requisitionNo = requisitions.getRequisitionNo();
        if ( requisitionNo == null ) {
            return null;
        }
        return requisitionNo;
    }

    private String productionProductCategoriesName(Production production) {
        if ( production == null ) {
            return null;
        }
        ProductCategory productCategories = production.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        String name = productCategories.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long productionProductCategoriesId(Production production) {
        if ( production == null ) {
            return null;
        }
        ProductCategory productCategories = production.getProductCategories();
        if ( productCategories == null ) {
            return null;
        }
        Long id = productCategories.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String productionProductsName(Production production) {
        if ( production == null ) {
            return null;
        }
        Product products = production.getProducts();
        if ( products == null ) {
            return null;
        }
        String name = products.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long productionRequisitionsId(Production production) {
        if ( production == null ) {
            return null;
        }
        Requisition requisitions = production.getRequisitions();
        if ( requisitions == null ) {
            return null;
        }
        Long id = requisitions.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
