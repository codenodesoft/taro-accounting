package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.SupplyOrder;
import org.soptorshi.domain.SupplyOrderDetails;
import org.soptorshi.service.dto.SupplyOrderDetailsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyOrderDetailsMapperImpl implements SupplyOrderDetailsMapper {

    @Autowired
    private SupplyOrderMapper supplyOrderMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<SupplyOrderDetails> toEntity(List<SupplyOrderDetailsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyOrderDetails> list = new ArrayList<SupplyOrderDetails>( dtoList.size() );
        for ( SupplyOrderDetailsDTO supplyOrderDetailsDTO : dtoList ) {
            list.add( toEntity( supplyOrderDetailsDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyOrderDetailsDTO> toDto(List<SupplyOrderDetails> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyOrderDetailsDTO> list = new ArrayList<SupplyOrderDetailsDTO>( entityList.size() );
        for ( SupplyOrderDetails supplyOrderDetails : entityList ) {
            list.add( toDto( supplyOrderDetails ) );
        }

        return list;
    }

    @Override
    public SupplyOrderDetailsDTO toDto(SupplyOrderDetails supplyOrderDetails) {
        if ( supplyOrderDetails == null ) {
            return null;
        }

        SupplyOrderDetailsDTO supplyOrderDetailsDTO = new SupplyOrderDetailsDTO();

        Long id = supplyOrderDetailsProductCategoryId( supplyOrderDetails );
        if ( id != null ) {
            supplyOrderDetailsDTO.setProductCategoryId( id );
        }
        Long id1 = supplyOrderDetailsSupplyOrderId( supplyOrderDetails );
        if ( id1 != null ) {
            supplyOrderDetailsDTO.setSupplyOrderId( id1 );
        }
        Long id2 = supplyOrderDetailsProductId( supplyOrderDetails );
        if ( id2 != null ) {
            supplyOrderDetailsDTO.setProductId( id2 );
        }
        String name = supplyOrderDetailsProductCategoryName( supplyOrderDetails );
        if ( name != null ) {
            supplyOrderDetailsDTO.setProductCategoryName( name );
        }
        String orderNo = supplyOrderDetailsSupplyOrderOrderNo( supplyOrderDetails );
        if ( orderNo != null ) {
            supplyOrderDetailsDTO.setSupplyOrderOrderNo( orderNo );
        }
        String name1 = supplyOrderDetailsProductName( supplyOrderDetails );
        if ( name1 != null ) {
            supplyOrderDetailsDTO.setProductName( name1 );
        }
        supplyOrderDetailsDTO.setId( supplyOrderDetails.getId() );
        supplyOrderDetailsDTO.setCreatedBy( supplyOrderDetails.getCreatedBy() );
        supplyOrderDetailsDTO.setCreatedOn( supplyOrderDetails.getCreatedOn() );
        supplyOrderDetailsDTO.setUpdatedBy( supplyOrderDetails.getUpdatedBy() );
        supplyOrderDetailsDTO.setUpdatedOn( supplyOrderDetails.getUpdatedOn() );
        supplyOrderDetailsDTO.setQuantity( supplyOrderDetails.getQuantity() );
        supplyOrderDetailsDTO.setPrice( supplyOrderDetails.getPrice() );

        return supplyOrderDetailsDTO;
    }

    @Override
    public SupplyOrderDetails toEntity(SupplyOrderDetailsDTO supplyOrderDetailsDTO) {
        if ( supplyOrderDetailsDTO == null ) {
            return null;
        }

        SupplyOrderDetails supplyOrderDetails = new SupplyOrderDetails();

        supplyOrderDetails.setProduct( productMapper.fromId( supplyOrderDetailsDTO.getProductId() ) );
        supplyOrderDetails.setSupplyOrder( supplyOrderMapper.fromId( supplyOrderDetailsDTO.getSupplyOrderId() ) );
        supplyOrderDetails.setProductCategory( productCategoryMapper.fromId( supplyOrderDetailsDTO.getProductCategoryId() ) );
        supplyOrderDetails.setId( supplyOrderDetailsDTO.getId() );
        supplyOrderDetails.setCreatedBy( supplyOrderDetailsDTO.getCreatedBy() );
        supplyOrderDetails.setCreatedOn( supplyOrderDetailsDTO.getCreatedOn() );
        supplyOrderDetails.setUpdatedBy( supplyOrderDetailsDTO.getUpdatedBy() );
        supplyOrderDetails.setUpdatedOn( supplyOrderDetailsDTO.getUpdatedOn() );
        supplyOrderDetails.setQuantity( supplyOrderDetailsDTO.getQuantity() );
        supplyOrderDetails.setPrice( supplyOrderDetailsDTO.getPrice() );

        return supplyOrderDetails;
    }

    private Long supplyOrderDetailsProductCategoryId(SupplyOrderDetails supplyOrderDetails) {
        if ( supplyOrderDetails == null ) {
            return null;
        }
        ProductCategory productCategory = supplyOrderDetails.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        Long id = productCategory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyOrderDetailsSupplyOrderId(SupplyOrderDetails supplyOrderDetails) {
        if ( supplyOrderDetails == null ) {
            return null;
        }
        SupplyOrder supplyOrder = supplyOrderDetails.getSupplyOrder();
        if ( supplyOrder == null ) {
            return null;
        }
        Long id = supplyOrder.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyOrderDetailsProductId(SupplyOrderDetails supplyOrderDetails) {
        if ( supplyOrderDetails == null ) {
            return null;
        }
        Product product = supplyOrderDetails.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyOrderDetailsProductCategoryName(SupplyOrderDetails supplyOrderDetails) {
        if ( supplyOrderDetails == null ) {
            return null;
        }
        ProductCategory productCategory = supplyOrderDetails.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        String name = productCategory.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyOrderDetailsSupplyOrderOrderNo(SupplyOrderDetails supplyOrderDetails) {
        if ( supplyOrderDetails == null ) {
            return null;
        }
        SupplyOrder supplyOrder = supplyOrderDetails.getSupplyOrder();
        if ( supplyOrder == null ) {
            return null;
        }
        String orderNo = supplyOrder.getOrderNo();
        if ( orderNo == null ) {
            return null;
        }
        return orderNo;
    }

    private String supplyOrderDetailsProductName(SupplyOrderDetails supplyOrderDetails) {
        if ( supplyOrderDetails == null ) {
            return null;
        }
        Product product = supplyOrderDetails.getProduct();
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
