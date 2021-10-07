package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyAreaManager;
import org.soptorshi.domain.SupplyOrder;
import org.soptorshi.domain.SupplySalesRepresentative;
import org.soptorshi.domain.SupplyShop;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyOrderMapperImpl implements SupplyOrderMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;
    @Autowired
    private SupplyAreaMapper supplyAreaMapper;
    @Autowired
    private SupplySalesRepresentativeMapper supplySalesRepresentativeMapper;
    @Autowired
    private SupplyAreaManagerMapper supplyAreaManagerMapper;
    @Autowired
    private SupplyShopMapper supplyShopMapper;

    @Override
    public List<SupplyOrder> toEntity(List<SupplyOrderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyOrder> list = new ArrayList<SupplyOrder>( dtoList.size() );
        for ( SupplyOrderDTO supplyOrderDTO : dtoList ) {
            list.add( toEntity( supplyOrderDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyOrderDTO> toDto(List<SupplyOrder> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyOrderDTO> list = new ArrayList<SupplyOrderDTO>( entityList.size() );
        for ( SupplyOrder supplyOrder : entityList ) {
            list.add( toDto( supplyOrder ) );
        }

        return list;
    }

    @Override
    public SupplyOrderDTO toDto(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }

        SupplyOrderDTO supplyOrderDTO = new SupplyOrderDTO();

        Long id = supplyOrderSupplyAreaId( supplyOrder );
        if ( id != null ) {
            supplyOrderDTO.setSupplyAreaId( id );
        }
        String name = supplyOrderSupplyAreaName( supplyOrder );
        if ( name != null ) {
            supplyOrderDTO.setSupplyAreaName( name );
        }
        String name1 = supplyOrderSupplyShopName( supplyOrder );
        if ( name1 != null ) {
            supplyOrderDTO.setSupplyShopName( name1 );
        }
        String name2 = supplyOrderSupplyZoneName( supplyOrder );
        if ( name2 != null ) {
            supplyOrderDTO.setSupplyZoneName( name2 );
        }
        Long id1 = supplyOrderSupplyZoneManagerId( supplyOrder );
        if ( id1 != null ) {
            supplyOrderDTO.setSupplyZoneManagerId( id1 );
        }
        Long id2 = supplyOrderSupplyShopId( supplyOrder );
        if ( id2 != null ) {
            supplyOrderDTO.setSupplyShopId( id2 );
        }
        Long id3 = supplyOrderSupplySalesRepresentativeId( supplyOrder );
        if ( id3 != null ) {
            supplyOrderDTO.setSupplySalesRepresentativeId( id3 );
        }
        String name3 = supplyOrderSupplySalesRepresentativeName( supplyOrder );
        if ( name3 != null ) {
            supplyOrderDTO.setSupplySalesRepresentativeName( name3 );
        }
        Long id4 = supplyOrderSupplyAreaManagerId( supplyOrder );
        if ( id4 != null ) {
            supplyOrderDTO.setSupplyAreaManagerId( id4 );
        }
        Long id5 = supplyOrderSupplyZoneId( supplyOrder );
        if ( id5 != null ) {
            supplyOrderDTO.setSupplyZoneId( id5 );
        }
        supplyOrderDTO.setId( supplyOrder.getId() );
        supplyOrderDTO.setOrderNo( supplyOrder.getOrderNo() );
        supplyOrderDTO.setDateOfOrder( supplyOrder.getDateOfOrder() );
        supplyOrderDTO.setCreatedBy( supplyOrder.getCreatedBy() );
        supplyOrderDTO.setCreatedOn( supplyOrder.getCreatedOn() );
        supplyOrderDTO.setUpdatedBy( supplyOrder.getUpdatedBy() );
        supplyOrderDTO.setUpdatedOn( supplyOrder.getUpdatedOn() );
        supplyOrderDTO.setDeliveryDate( supplyOrder.getDeliveryDate() );
        supplyOrderDTO.setStatus( supplyOrder.getStatus() );
        supplyOrderDTO.setAreaWiseAccumulationRefNo( supplyOrder.getAreaWiseAccumulationRefNo() );
        supplyOrderDTO.setRemarks( supplyOrder.getRemarks() );

        return supplyOrderDTO;
    }

    @Override
    public SupplyOrder toEntity(SupplyOrderDTO supplyOrderDTO) {
        if ( supplyOrderDTO == null ) {
            return null;
        }

        SupplyOrder supplyOrder = new SupplyOrder();

        supplyOrder.setSupplyAreaManager( supplyAreaManagerMapper.fromId( supplyOrderDTO.getSupplyAreaManagerId() ) );
        supplyOrder.setSupplyShop( supplyShopMapper.fromId( supplyOrderDTO.getSupplyShopId() ) );
        supplyOrder.setSupplyArea( supplyAreaMapper.fromId( supplyOrderDTO.getSupplyAreaId() ) );
        supplyOrder.setSupplyZone( supplyZoneMapper.fromId( supplyOrderDTO.getSupplyZoneId() ) );
        supplyOrder.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyOrderDTO.getSupplyZoneManagerId() ) );
        supplyOrder.setSupplySalesRepresentative( supplySalesRepresentativeMapper.fromId( supplyOrderDTO.getSupplySalesRepresentativeId() ) );
        supplyOrder.setId( supplyOrderDTO.getId() );
        supplyOrder.setOrderNo( supplyOrderDTO.getOrderNo() );
        supplyOrder.setDateOfOrder( supplyOrderDTO.getDateOfOrder() );
        supplyOrder.setCreatedBy( supplyOrderDTO.getCreatedBy() );
        supplyOrder.setCreatedOn( supplyOrderDTO.getCreatedOn() );
        supplyOrder.setUpdatedBy( supplyOrderDTO.getUpdatedBy() );
        supplyOrder.setUpdatedOn( supplyOrderDTO.getUpdatedOn() );
        supplyOrder.setDeliveryDate( supplyOrderDTO.getDeliveryDate() );
        supplyOrder.setStatus( supplyOrderDTO.getStatus() );
        supplyOrder.setAreaWiseAccumulationRefNo( supplyOrderDTO.getAreaWiseAccumulationRefNo() );
        supplyOrder.setRemarks( supplyOrderDTO.getRemarks() );

        return supplyOrder;
    }

    private Long supplyOrderSupplyAreaId(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyOrder.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        Long id = supplyArea.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyOrderSupplyAreaName(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyOrder.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        String name = supplyArea.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyOrderSupplyShopName(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyShop supplyShop = supplyOrder.getSupplyShop();
        if ( supplyShop == null ) {
            return null;
        }
        String name = supplyShop.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyOrderSupplyZoneName(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyOrder.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyOrderSupplyZoneManagerId(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyOrder.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyOrderSupplyShopId(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyShop supplyShop = supplyOrder.getSupplyShop();
        if ( supplyShop == null ) {
            return null;
        }
        Long id = supplyShop.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyOrderSupplySalesRepresentativeId(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyOrder.getSupplySalesRepresentative();
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        Long id = supplySalesRepresentative.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyOrderSupplySalesRepresentativeName(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyOrder.getSupplySalesRepresentative();
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        String name = supplySalesRepresentative.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyOrderSupplyAreaManagerId(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyAreaManager supplyAreaManager = supplyOrder.getSupplyAreaManager();
        if ( supplyAreaManager == null ) {
            return null;
        }
        Long id = supplyAreaManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyOrderSupplyZoneId(SupplyOrder supplyOrder) {
        if ( supplyOrder == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyOrder.getSupplyZone();
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
