package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.domain.SupplyZoneWiseAccumulation;
import org.soptorshi.service.dto.SupplyZoneWiseAccumulationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyZoneWiseAccumulationMapperImpl implements SupplyZoneWiseAccumulationMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<SupplyZoneWiseAccumulation> toEntity(List<SupplyZoneWiseAccumulationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyZoneWiseAccumulation> list = new ArrayList<SupplyZoneWiseAccumulation>( dtoList.size() );
        for ( SupplyZoneWiseAccumulationDTO supplyZoneWiseAccumulationDTO : dtoList ) {
            list.add( toEntity( supplyZoneWiseAccumulationDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyZoneWiseAccumulationDTO> toDto(List<SupplyZoneWiseAccumulation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyZoneWiseAccumulationDTO> list = new ArrayList<SupplyZoneWiseAccumulationDTO>( entityList.size() );
        for ( SupplyZoneWiseAccumulation supplyZoneWiseAccumulation : entityList ) {
            list.add( toDto( supplyZoneWiseAccumulation ) );
        }

        return list;
    }

    @Override
    public SupplyZoneWiseAccumulationDTO toDto(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }

        SupplyZoneWiseAccumulationDTO supplyZoneWiseAccumulationDTO = new SupplyZoneWiseAccumulationDTO();

        String name = supplyZoneWiseAccumulationSupplyZoneName( supplyZoneWiseAccumulation );
        if ( name != null ) {
            supplyZoneWiseAccumulationDTO.setSupplyZoneName( name );
        }
        Long id = supplyZoneWiseAccumulationProductCategoryId( supplyZoneWiseAccumulation );
        if ( id != null ) {
            supplyZoneWiseAccumulationDTO.setProductCategoryId( id );
        }
        Long id1 = supplyZoneWiseAccumulationSupplyZoneManagerId( supplyZoneWiseAccumulation );
        if ( id1 != null ) {
            supplyZoneWiseAccumulationDTO.setSupplyZoneManagerId( id1 );
        }
        Long id2 = supplyZoneWiseAccumulationProductId( supplyZoneWiseAccumulation );
        if ( id2 != null ) {
            supplyZoneWiseAccumulationDTO.setProductId( id2 );
        }
        String name1 = supplyZoneWiseAccumulationProductCategoryName( supplyZoneWiseAccumulation );
        if ( name1 != null ) {
            supplyZoneWiseAccumulationDTO.setProductCategoryName( name1 );
        }
        String name2 = supplyZoneWiseAccumulationProductName( supplyZoneWiseAccumulation );
        if ( name2 != null ) {
            supplyZoneWiseAccumulationDTO.setProductName( name2 );
        }
        Long id3 = supplyZoneWiseAccumulationSupplyZoneId( supplyZoneWiseAccumulation );
        if ( id3 != null ) {
            supplyZoneWiseAccumulationDTO.setSupplyZoneId( id3 );
        }
        supplyZoneWiseAccumulationDTO.setId( supplyZoneWiseAccumulation.getId() );
        supplyZoneWiseAccumulationDTO.setZoneWiseAccumulationRefNo( supplyZoneWiseAccumulation.getZoneWiseAccumulationRefNo() );
        supplyZoneWiseAccumulationDTO.setQuantity( supplyZoneWiseAccumulation.getQuantity() );
        supplyZoneWiseAccumulationDTO.setPrice( supplyZoneWiseAccumulation.getPrice() );
        supplyZoneWiseAccumulationDTO.setStatus( supplyZoneWiseAccumulation.getStatus() );
        supplyZoneWiseAccumulationDTO.setRemarks( supplyZoneWiseAccumulation.getRemarks() );
        supplyZoneWiseAccumulationDTO.setCreatedBy( supplyZoneWiseAccumulation.getCreatedBy() );
        supplyZoneWiseAccumulationDTO.setCreatedOn( supplyZoneWiseAccumulation.getCreatedOn() );
        supplyZoneWiseAccumulationDTO.setUpdatedBy( supplyZoneWiseAccumulation.getUpdatedBy() );
        supplyZoneWiseAccumulationDTO.setUpdatedOn( supplyZoneWiseAccumulation.getUpdatedOn() );

        return supplyZoneWiseAccumulationDTO;
    }

    @Override
    public SupplyZoneWiseAccumulation toEntity(SupplyZoneWiseAccumulationDTO supplyZoneWiseAccumulationDTO) {
        if ( supplyZoneWiseAccumulationDTO == null ) {
            return null;
        }

        SupplyZoneWiseAccumulation supplyZoneWiseAccumulation = new SupplyZoneWiseAccumulation();

        supplyZoneWiseAccumulation.setProduct( productMapper.fromId( supplyZoneWiseAccumulationDTO.getProductId() ) );
        supplyZoneWiseAccumulation.setSupplyZone( supplyZoneMapper.fromId( supplyZoneWiseAccumulationDTO.getSupplyZoneId() ) );
        supplyZoneWiseAccumulation.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyZoneWiseAccumulationDTO.getSupplyZoneManagerId() ) );
        supplyZoneWiseAccumulation.setProductCategory( productCategoryMapper.fromId( supplyZoneWiseAccumulationDTO.getProductCategoryId() ) );
        supplyZoneWiseAccumulation.setId( supplyZoneWiseAccumulationDTO.getId() );
        supplyZoneWiseAccumulation.setZoneWiseAccumulationRefNo( supplyZoneWiseAccumulationDTO.getZoneWiseAccumulationRefNo() );
        supplyZoneWiseAccumulation.setQuantity( supplyZoneWiseAccumulationDTO.getQuantity() );
        supplyZoneWiseAccumulation.setPrice( supplyZoneWiseAccumulationDTO.getPrice() );
        supplyZoneWiseAccumulation.setStatus( supplyZoneWiseAccumulationDTO.getStatus() );
        supplyZoneWiseAccumulation.setRemarks( supplyZoneWiseAccumulationDTO.getRemarks() );
        supplyZoneWiseAccumulation.setCreatedBy( supplyZoneWiseAccumulationDTO.getCreatedBy() );
        supplyZoneWiseAccumulation.setCreatedOn( supplyZoneWiseAccumulationDTO.getCreatedOn() );
        supplyZoneWiseAccumulation.setUpdatedBy( supplyZoneWiseAccumulationDTO.getUpdatedBy() );
        supplyZoneWiseAccumulation.setUpdatedOn( supplyZoneWiseAccumulationDTO.getUpdatedOn() );

        return supplyZoneWiseAccumulation;
    }

    private String supplyZoneWiseAccumulationSupplyZoneName(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyZoneWiseAccumulation.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyZoneWiseAccumulationProductCategoryId(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }
        ProductCategory productCategory = supplyZoneWiseAccumulation.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        Long id = productCategory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyZoneWiseAccumulationSupplyZoneManagerId(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyZoneWiseAccumulation.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyZoneWiseAccumulationProductId(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }
        Product product = supplyZoneWiseAccumulation.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyZoneWiseAccumulationProductCategoryName(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }
        ProductCategory productCategory = supplyZoneWiseAccumulation.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        String name = productCategory.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyZoneWiseAccumulationProductName(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }
        Product product = supplyZoneWiseAccumulation.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyZoneWiseAccumulationSupplyZoneId(SupplyZoneWiseAccumulation supplyZoneWiseAccumulation) {
        if ( supplyZoneWiseAccumulation == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyZoneWiseAccumulation.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        Long id = supplyZone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
