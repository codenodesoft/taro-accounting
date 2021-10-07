package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyAreaManager;
import org.soptorshi.domain.SupplyMoneyCollection;
import org.soptorshi.domain.SupplyOrder;
import org.soptorshi.domain.SupplySalesRepresentative;
import org.soptorshi.domain.SupplyShop;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyMoneyCollectionDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyMoneyCollectionMapperImpl implements SupplyMoneyCollectionMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;
    @Autowired
    private SupplyAreaMapper supplyAreaMapper;
    @Autowired
    private SupplyAreaManagerMapper supplyAreaManagerMapper;
    @Autowired
    private SupplySalesRepresentativeMapper supplySalesRepresentativeMapper;
    @Autowired
    private SupplyShopMapper supplyShopMapper;
    @Autowired
    private SupplyOrderMapper supplyOrderMapper;

    @Override
    public List<SupplyMoneyCollection> toEntity(List<SupplyMoneyCollectionDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyMoneyCollection> list = new ArrayList<SupplyMoneyCollection>( dtoList.size() );
        for ( SupplyMoneyCollectionDTO supplyMoneyCollectionDTO : dtoList ) {
            list.add( toEntity( supplyMoneyCollectionDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyMoneyCollectionDTO> toDto(List<SupplyMoneyCollection> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyMoneyCollectionDTO> list = new ArrayList<SupplyMoneyCollectionDTO>( entityList.size() );
        for ( SupplyMoneyCollection supplyMoneyCollection : entityList ) {
            list.add( toDto( supplyMoneyCollection ) );
        }

        return list;
    }

    @Override
    public SupplyMoneyCollectionDTO toDto(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }

        SupplyMoneyCollectionDTO supplyMoneyCollectionDTO = new SupplyMoneyCollectionDTO();

        Long id = supplyMoneyCollectionSupplyAreaId( supplyMoneyCollection );
        if ( id != null ) {
            supplyMoneyCollectionDTO.setSupplyAreaId( id );
        }
        String name = supplyMoneyCollectionSupplyAreaName( supplyMoneyCollection );
        if ( name != null ) {
            supplyMoneyCollectionDTO.setSupplyAreaName( name );
        }
        String name1 = supplyMoneyCollectionSupplyZoneName( supplyMoneyCollection );
        if ( name1 != null ) {
            supplyMoneyCollectionDTO.setSupplyZoneName( name1 );
        }
        Long id1 = supplyMoneyCollectionSupplyZoneManagerId( supplyMoneyCollection );
        if ( id1 != null ) {
            supplyMoneyCollectionDTO.setSupplyZoneManagerId( id1 );
        }
        Long id2 = supplyMoneyCollectionSupplyShopId( supplyMoneyCollection );
        if ( id2 != null ) {
            supplyMoneyCollectionDTO.setSupplyShopId( id2 );
        }
        Long id3 = supplyMoneyCollectionSupplyAreaManagerId( supplyMoneyCollection );
        if ( id3 != null ) {
            supplyMoneyCollectionDTO.setSupplyAreaManagerId( id3 );
        }
        String orderNo = supplyMoneyCollectionSupplyOrderOrderNo( supplyMoneyCollection );
        if ( orderNo != null ) {
            supplyMoneyCollectionDTO.setSupplyOrderOrderNo( orderNo );
        }
        Long id4 = supplyMoneyCollectionSupplyZoneId( supplyMoneyCollection );
        if ( id4 != null ) {
            supplyMoneyCollectionDTO.setSupplyZoneId( id4 );
        }
        String name2 = supplyMoneyCollectionSupplyShopName( supplyMoneyCollection );
        if ( name2 != null ) {
            supplyMoneyCollectionDTO.setSupplyShopName( name2 );
        }
        Long id5 = supplyMoneyCollectionSupplyOrderId( supplyMoneyCollection );
        if ( id5 != null ) {
            supplyMoneyCollectionDTO.setSupplyOrderId( id5 );
        }
        Long id6 = supplyMoneyCollectionSupplySalesRepresentativeId( supplyMoneyCollection );
        if ( id6 != null ) {
            supplyMoneyCollectionDTO.setSupplySalesRepresentativeId( id6 );
        }
        String name3 = supplyMoneyCollectionSupplySalesRepresentativeName( supplyMoneyCollection );
        if ( name3 != null ) {
            supplyMoneyCollectionDTO.setSupplySalesRepresentativeName( name3 );
        }
        supplyMoneyCollectionDTO.setId( supplyMoneyCollection.getId() );
        supplyMoneyCollectionDTO.setTotalAmount( supplyMoneyCollection.getTotalAmount() );
        supplyMoneyCollectionDTO.setReceivedAmount( supplyMoneyCollection.getReceivedAmount() );
        supplyMoneyCollectionDTO.setRemarks( supplyMoneyCollection.getRemarks() );
        supplyMoneyCollectionDTO.setCreatedBy( supplyMoneyCollection.getCreatedBy() );
        supplyMoneyCollectionDTO.setCreatedOn( supplyMoneyCollection.getCreatedOn() );
        supplyMoneyCollectionDTO.setUpdatedBy( supplyMoneyCollection.getUpdatedBy() );
        supplyMoneyCollectionDTO.setUpdatedOn( supplyMoneyCollection.getUpdatedOn() );

        return supplyMoneyCollectionDTO;
    }

    @Override
    public SupplyMoneyCollection toEntity(SupplyMoneyCollectionDTO supplyMoneyCollectionDTO) {
        if ( supplyMoneyCollectionDTO == null ) {
            return null;
        }

        SupplyMoneyCollection supplyMoneyCollection = new SupplyMoneyCollection();

        supplyMoneyCollection.setSupplyOrder( supplyOrderMapper.fromId( supplyMoneyCollectionDTO.getSupplyOrderId() ) );
        supplyMoneyCollection.setSupplyAreaManager( supplyAreaManagerMapper.fromId( supplyMoneyCollectionDTO.getSupplyAreaManagerId() ) );
        supplyMoneyCollection.setSupplyShop( supplyShopMapper.fromId( supplyMoneyCollectionDTO.getSupplyShopId() ) );
        supplyMoneyCollection.setSupplyArea( supplyAreaMapper.fromId( supplyMoneyCollectionDTO.getSupplyAreaId() ) );
        supplyMoneyCollection.setSupplyZone( supplyZoneMapper.fromId( supplyMoneyCollectionDTO.getSupplyZoneId() ) );
        supplyMoneyCollection.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyMoneyCollectionDTO.getSupplyZoneManagerId() ) );
        supplyMoneyCollection.setSupplySalesRepresentative( supplySalesRepresentativeMapper.fromId( supplyMoneyCollectionDTO.getSupplySalesRepresentativeId() ) );
        supplyMoneyCollection.setId( supplyMoneyCollectionDTO.getId() );
        supplyMoneyCollection.setTotalAmount( supplyMoneyCollectionDTO.getTotalAmount() );
        supplyMoneyCollection.setReceivedAmount( supplyMoneyCollectionDTO.getReceivedAmount() );
        supplyMoneyCollection.setRemarks( supplyMoneyCollectionDTO.getRemarks() );
        supplyMoneyCollection.setCreatedBy( supplyMoneyCollectionDTO.getCreatedBy() );
        supplyMoneyCollection.setCreatedOn( supplyMoneyCollectionDTO.getCreatedOn() );
        supplyMoneyCollection.setUpdatedBy( supplyMoneyCollectionDTO.getUpdatedBy() );
        supplyMoneyCollection.setUpdatedOn( supplyMoneyCollectionDTO.getUpdatedOn() );

        return supplyMoneyCollection;
    }

    private Long supplyMoneyCollectionSupplyAreaId(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyMoneyCollection.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        Long id = supplyArea.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyMoneyCollectionSupplyAreaName(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyMoneyCollection.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        String name = supplyArea.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyMoneyCollectionSupplyZoneName(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyMoneyCollection.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyMoneyCollectionSupplyZoneManagerId(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyMoneyCollection.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyMoneyCollectionSupplyShopId(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyShop supplyShop = supplyMoneyCollection.getSupplyShop();
        if ( supplyShop == null ) {
            return null;
        }
        Long id = supplyShop.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyMoneyCollectionSupplyAreaManagerId(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyAreaManager supplyAreaManager = supplyMoneyCollection.getSupplyAreaManager();
        if ( supplyAreaManager == null ) {
            return null;
        }
        Long id = supplyAreaManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyMoneyCollectionSupplyOrderOrderNo(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyOrder supplyOrder = supplyMoneyCollection.getSupplyOrder();
        if ( supplyOrder == null ) {
            return null;
        }
        String orderNo = supplyOrder.getOrderNo();
        if ( orderNo == null ) {
            return null;
        }
        return orderNo;
    }

    private Long supplyMoneyCollectionSupplyZoneId(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyMoneyCollection.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        Long id = supplyZone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyMoneyCollectionSupplyShopName(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyShop supplyShop = supplyMoneyCollection.getSupplyShop();
        if ( supplyShop == null ) {
            return null;
        }
        String name = supplyShop.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyMoneyCollectionSupplyOrderId(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplyOrder supplyOrder = supplyMoneyCollection.getSupplyOrder();
        if ( supplyOrder == null ) {
            return null;
        }
        Long id = supplyOrder.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyMoneyCollectionSupplySalesRepresentativeId(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyMoneyCollection.getSupplySalesRepresentative();
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        Long id = supplySalesRepresentative.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyMoneyCollectionSupplySalesRepresentativeName(SupplyMoneyCollection supplyMoneyCollection) {
        if ( supplyMoneyCollection == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyMoneyCollection.getSupplySalesRepresentative();
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        String name = supplySalesRepresentative.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
