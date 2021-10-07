package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Product;
import org.soptorshi.domain.ProductCategory;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyAreaManager;
import org.soptorshi.domain.SupplyAreaWiseAccumulation;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyAreaWiseAccumulationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyAreaWiseAccumulationMapperImpl implements SupplyAreaWiseAccumulationMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;
    @Autowired
    private SupplyAreaMapper supplyAreaMapper;
    @Autowired
    private SupplyAreaManagerMapper supplyAreaManagerMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;
    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<SupplyAreaWiseAccumulation> toEntity(List<SupplyAreaWiseAccumulationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyAreaWiseAccumulation> list = new ArrayList<SupplyAreaWiseAccumulation>( dtoList.size() );
        for ( SupplyAreaWiseAccumulationDTO supplyAreaWiseAccumulationDTO : dtoList ) {
            list.add( toEntity( supplyAreaWiseAccumulationDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyAreaWiseAccumulationDTO> toDto(List<SupplyAreaWiseAccumulation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyAreaWiseAccumulationDTO> list = new ArrayList<SupplyAreaWiseAccumulationDTO>( entityList.size() );
        for ( SupplyAreaWiseAccumulation supplyAreaWiseAccumulation : entityList ) {
            list.add( toDto( supplyAreaWiseAccumulation ) );
        }

        return list;
    }

    @Override
    public SupplyAreaWiseAccumulationDTO toDto(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }

        SupplyAreaWiseAccumulationDTO supplyAreaWiseAccumulationDTO = new SupplyAreaWiseAccumulationDTO();

        Long id = supplyAreaWiseAccumulationSupplyAreaId( supplyAreaWiseAccumulation );
        if ( id != null ) {
            supplyAreaWiseAccumulationDTO.setSupplyAreaId( id );
        }
        String name = supplyAreaWiseAccumulationSupplyAreaName( supplyAreaWiseAccumulation );
        if ( name != null ) {
            supplyAreaWiseAccumulationDTO.setSupplyAreaName( name );
        }
        String name1 = supplyAreaWiseAccumulationSupplyZoneName( supplyAreaWiseAccumulation );
        if ( name1 != null ) {
            supplyAreaWiseAccumulationDTO.setSupplyZoneName( name1 );
        }
        Long id1 = supplyAreaWiseAccumulationProductCategoryId( supplyAreaWiseAccumulation );
        if ( id1 != null ) {
            supplyAreaWiseAccumulationDTO.setProductCategoryId( id1 );
        }
        Long id2 = supplyAreaWiseAccumulationSupplyZoneManagerId( supplyAreaWiseAccumulation );
        if ( id2 != null ) {
            supplyAreaWiseAccumulationDTO.setSupplyZoneManagerId( id2 );
        }
        Long id3 = supplyAreaWiseAccumulationProductId( supplyAreaWiseAccumulation );
        if ( id3 != null ) {
            supplyAreaWiseAccumulationDTO.setProductId( id3 );
        }
        String name2 = supplyAreaWiseAccumulationProductCategoryName( supplyAreaWiseAccumulation );
        if ( name2 != null ) {
            supplyAreaWiseAccumulationDTO.setProductCategoryName( name2 );
        }
        Long id4 = supplyAreaWiseAccumulationSupplyAreaManagerId( supplyAreaWiseAccumulation );
        if ( id4 != null ) {
            supplyAreaWiseAccumulationDTO.setSupplyAreaManagerId( id4 );
        }
        String name3 = supplyAreaWiseAccumulationProductName( supplyAreaWiseAccumulation );
        if ( name3 != null ) {
            supplyAreaWiseAccumulationDTO.setProductName( name3 );
        }
        Long id5 = supplyAreaWiseAccumulationSupplyZoneId( supplyAreaWiseAccumulation );
        if ( id5 != null ) {
            supplyAreaWiseAccumulationDTO.setSupplyZoneId( id5 );
        }
        supplyAreaWiseAccumulationDTO.setId( supplyAreaWiseAccumulation.getId() );
        supplyAreaWiseAccumulationDTO.setAreaWiseAccumulationRefNo( supplyAreaWiseAccumulation.getAreaWiseAccumulationRefNo() );
        supplyAreaWiseAccumulationDTO.setQuantity( supplyAreaWiseAccumulation.getQuantity() );
        supplyAreaWiseAccumulationDTO.setPrice( supplyAreaWiseAccumulation.getPrice() );
        supplyAreaWiseAccumulationDTO.setStatus( supplyAreaWiseAccumulation.getStatus() );
        supplyAreaWiseAccumulationDTO.setZoneWiseAccumulationRefNo( supplyAreaWiseAccumulation.getZoneWiseAccumulationRefNo() );
        supplyAreaWiseAccumulationDTO.setRemarks( supplyAreaWiseAccumulation.getRemarks() );
        supplyAreaWiseAccumulationDTO.setCreatedBy( supplyAreaWiseAccumulation.getCreatedBy() );
        supplyAreaWiseAccumulationDTO.setCreatedOn( supplyAreaWiseAccumulation.getCreatedOn() );
        supplyAreaWiseAccumulationDTO.setUpdatedBy( supplyAreaWiseAccumulation.getUpdatedBy() );
        supplyAreaWiseAccumulationDTO.setUpdatedOn( supplyAreaWiseAccumulation.getUpdatedOn() );

        return supplyAreaWiseAccumulationDTO;
    }

    @Override
    public SupplyAreaWiseAccumulation toEntity(SupplyAreaWiseAccumulationDTO supplyAreaWiseAccumulationDTO) {
        if ( supplyAreaWiseAccumulationDTO == null ) {
            return null;
        }

        SupplyAreaWiseAccumulation supplyAreaWiseAccumulation = new SupplyAreaWiseAccumulation();

        supplyAreaWiseAccumulation.setProduct( productMapper.fromId( supplyAreaWiseAccumulationDTO.getProductId() ) );
        supplyAreaWiseAccumulation.setSupplyAreaManager( supplyAreaManagerMapper.fromId( supplyAreaWiseAccumulationDTO.getSupplyAreaManagerId() ) );
        supplyAreaWiseAccumulation.setSupplyArea( supplyAreaMapper.fromId( supplyAreaWiseAccumulationDTO.getSupplyAreaId() ) );
        supplyAreaWiseAccumulation.setSupplyZone( supplyZoneMapper.fromId( supplyAreaWiseAccumulationDTO.getSupplyZoneId() ) );
        supplyAreaWiseAccumulation.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyAreaWiseAccumulationDTO.getSupplyZoneManagerId() ) );
        supplyAreaWiseAccumulation.setProductCategory( productCategoryMapper.fromId( supplyAreaWiseAccumulationDTO.getProductCategoryId() ) );
        supplyAreaWiseAccumulation.setId( supplyAreaWiseAccumulationDTO.getId() );
        supplyAreaWiseAccumulation.setAreaWiseAccumulationRefNo( supplyAreaWiseAccumulationDTO.getAreaWiseAccumulationRefNo() );
        supplyAreaWiseAccumulation.setQuantity( supplyAreaWiseAccumulationDTO.getQuantity() );
        supplyAreaWiseAccumulation.setPrice( supplyAreaWiseAccumulationDTO.getPrice() );
        supplyAreaWiseAccumulation.setStatus( supplyAreaWiseAccumulationDTO.getStatus() );
        supplyAreaWiseAccumulation.setZoneWiseAccumulationRefNo( supplyAreaWiseAccumulationDTO.getZoneWiseAccumulationRefNo() );
        supplyAreaWiseAccumulation.setRemarks( supplyAreaWiseAccumulationDTO.getRemarks() );
        supplyAreaWiseAccumulation.setCreatedBy( supplyAreaWiseAccumulationDTO.getCreatedBy() );
        supplyAreaWiseAccumulation.setCreatedOn( supplyAreaWiseAccumulationDTO.getCreatedOn() );
        supplyAreaWiseAccumulation.setUpdatedBy( supplyAreaWiseAccumulationDTO.getUpdatedBy() );
        supplyAreaWiseAccumulation.setUpdatedOn( supplyAreaWiseAccumulationDTO.getUpdatedOn() );

        return supplyAreaWiseAccumulation;
    }

    private Long supplyAreaWiseAccumulationSupplyAreaId(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyAreaWiseAccumulation.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        Long id = supplyArea.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyAreaWiseAccumulationSupplyAreaName(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyAreaWiseAccumulation.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        String name = supplyArea.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyAreaWiseAccumulationSupplyZoneName(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyAreaWiseAccumulation.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyAreaWiseAccumulationProductCategoryId(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        ProductCategory productCategory = supplyAreaWiseAccumulation.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        Long id = productCategory.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyAreaWiseAccumulationSupplyZoneManagerId(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyAreaWiseAccumulation.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyAreaWiseAccumulationProductId(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        Product product = supplyAreaWiseAccumulation.getProduct();
        if ( product == null ) {
            return null;
        }
        Long id = product.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyAreaWiseAccumulationProductCategoryName(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        ProductCategory productCategory = supplyAreaWiseAccumulation.getProductCategory();
        if ( productCategory == null ) {
            return null;
        }
        String name = productCategory.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyAreaWiseAccumulationSupplyAreaManagerId(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        SupplyAreaManager supplyAreaManager = supplyAreaWiseAccumulation.getSupplyAreaManager();
        if ( supplyAreaManager == null ) {
            return null;
        }
        Long id = supplyAreaManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyAreaWiseAccumulationProductName(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        Product product = supplyAreaWiseAccumulation.getProduct();
        if ( product == null ) {
            return null;
        }
        String name = product.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyAreaWiseAccumulationSupplyZoneId(SupplyAreaWiseAccumulation supplyAreaWiseAccumulation) {
        if ( supplyAreaWiseAccumulation == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyAreaWiseAccumulation.getSupplyZone();
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
