package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyAreaManager;
import org.soptorshi.domain.SupplyChallan;
import org.soptorshi.domain.SupplyOrder;
import org.soptorshi.domain.SupplySalesRepresentative;
import org.soptorshi.domain.SupplyShop;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyChallanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyChallanMapperImpl implements SupplyChallanMapper {

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
    public List<SupplyChallan> toEntity(List<SupplyChallanDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyChallan> list = new ArrayList<SupplyChallan>( dtoList.size() );
        for ( SupplyChallanDTO supplyChallanDTO : dtoList ) {
            list.add( toEntity( supplyChallanDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyChallanDTO> toDto(List<SupplyChallan> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyChallanDTO> list = new ArrayList<SupplyChallanDTO>( entityList.size() );
        for ( SupplyChallan supplyChallan : entityList ) {
            list.add( toDto( supplyChallan ) );
        }

        return list;
    }

    @Override
    public SupplyChallanDTO toDto(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }

        SupplyChallanDTO supplyChallanDTO = new SupplyChallanDTO();

        Long id = supplyChallanSupplyAreaId( supplyChallan );
        if ( id != null ) {
            supplyChallanDTO.setSupplyAreaId( id );
        }
        String name = supplyChallanSupplyAreaName( supplyChallan );
        if ( name != null ) {
            supplyChallanDTO.setSupplyAreaName( name );
        }
        String name1 = supplyChallanSupplyZoneName( supplyChallan );
        if ( name1 != null ) {
            supplyChallanDTO.setSupplyZoneName( name1 );
        }
        Long id1 = supplyChallanSupplyZoneManagerId( supplyChallan );
        if ( id1 != null ) {
            supplyChallanDTO.setSupplyZoneManagerId( id1 );
        }
        Long id2 = supplyChallanSupplyShopId( supplyChallan );
        if ( id2 != null ) {
            supplyChallanDTO.setSupplyShopId( id2 );
        }
        Long id3 = supplyChallanSupplyAreaManagerId( supplyChallan );
        if ( id3 != null ) {
            supplyChallanDTO.setSupplyAreaManagerId( id3 );
        }
        String orderNo = supplyChallanSupplyOrderOrderNo( supplyChallan );
        if ( orderNo != null ) {
            supplyChallanDTO.setSupplyOrderOrderNo( orderNo );
        }
        Long id4 = supplyChallanSupplyZoneId( supplyChallan );
        if ( id4 != null ) {
            supplyChallanDTO.setSupplyZoneId( id4 );
        }
        String name2 = supplyChallanSupplyShopName( supplyChallan );
        if ( name2 != null ) {
            supplyChallanDTO.setSupplyShopName( name2 );
        }
        Long id5 = supplyChallanSupplyOrderId( supplyChallan );
        if ( id5 != null ) {
            supplyChallanDTO.setSupplyOrderId( id5 );
        }
        Long id6 = supplyChallanSupplySalesRepresentativeId( supplyChallan );
        if ( id6 != null ) {
            supplyChallanDTO.setSupplySalesRepresentativeId( id6 );
        }
        String name3 = supplyChallanSupplySalesRepresentativeName( supplyChallan );
        if ( name3 != null ) {
            supplyChallanDTO.setSupplySalesRepresentativeName( name3 );
        }
        supplyChallanDTO.setId( supplyChallan.getId() );
        supplyChallanDTO.setChallanNo( supplyChallan.getChallanNo() );
        supplyChallanDTO.setDateOfChallan( supplyChallan.getDateOfChallan() );
        supplyChallanDTO.setRemarks( supplyChallan.getRemarks() );
        supplyChallanDTO.setCreatedBy( supplyChallan.getCreatedBy() );
        supplyChallanDTO.setCreatedOn( supplyChallan.getCreatedOn() );
        supplyChallanDTO.setUpdatedBy( supplyChallan.getUpdatedBy() );
        supplyChallanDTO.setUpdatedOn( supplyChallan.getUpdatedOn() );

        return supplyChallanDTO;
    }

    @Override
    public SupplyChallan toEntity(SupplyChallanDTO supplyChallanDTO) {
        if ( supplyChallanDTO == null ) {
            return null;
        }

        SupplyChallan supplyChallan = new SupplyChallan();

        supplyChallan.setSupplyOrder( supplyOrderMapper.fromId( supplyChallanDTO.getSupplyOrderId() ) );
        supplyChallan.setSupplyAreaManager( supplyAreaManagerMapper.fromId( supplyChallanDTO.getSupplyAreaManagerId() ) );
        supplyChallan.setSupplyShop( supplyShopMapper.fromId( supplyChallanDTO.getSupplyShopId() ) );
        supplyChallan.setSupplyArea( supplyAreaMapper.fromId( supplyChallanDTO.getSupplyAreaId() ) );
        supplyChallan.setSupplyZone( supplyZoneMapper.fromId( supplyChallanDTO.getSupplyZoneId() ) );
        supplyChallan.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyChallanDTO.getSupplyZoneManagerId() ) );
        supplyChallan.setSupplySalesRepresentative( supplySalesRepresentativeMapper.fromId( supplyChallanDTO.getSupplySalesRepresentativeId() ) );
        supplyChallan.setId( supplyChallanDTO.getId() );
        supplyChallan.setChallanNo( supplyChallanDTO.getChallanNo() );
        supplyChallan.setDateOfChallan( supplyChallanDTO.getDateOfChallan() );
        supplyChallan.setRemarks( supplyChallanDTO.getRemarks() );
        supplyChallan.setCreatedBy( supplyChallanDTO.getCreatedBy() );
        supplyChallan.setCreatedOn( supplyChallanDTO.getCreatedOn() );
        supplyChallan.setUpdatedBy( supplyChallanDTO.getUpdatedBy() );
        supplyChallan.setUpdatedOn( supplyChallanDTO.getUpdatedOn() );

        return supplyChallan;
    }

    private Long supplyChallanSupplyAreaId(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyChallan.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        Long id = supplyArea.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyChallanSupplyAreaName(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyChallan.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        String name = supplyArea.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyChallanSupplyZoneName(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyChallan.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyChallanSupplyZoneManagerId(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyChallan.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyChallanSupplyShopId(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyShop supplyShop = supplyChallan.getSupplyShop();
        if ( supplyShop == null ) {
            return null;
        }
        Long id = supplyShop.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyChallanSupplyAreaManagerId(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyAreaManager supplyAreaManager = supplyChallan.getSupplyAreaManager();
        if ( supplyAreaManager == null ) {
            return null;
        }
        Long id = supplyAreaManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyChallanSupplyOrderOrderNo(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyOrder supplyOrder = supplyChallan.getSupplyOrder();
        if ( supplyOrder == null ) {
            return null;
        }
        String orderNo = supplyOrder.getOrderNo();
        if ( orderNo == null ) {
            return null;
        }
        return orderNo;
    }

    private Long supplyChallanSupplyZoneId(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyChallan.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        Long id = supplyZone.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyChallanSupplyShopName(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyShop supplyShop = supplyChallan.getSupplyShop();
        if ( supplyShop == null ) {
            return null;
        }
        String name = supplyShop.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyChallanSupplyOrderId(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplyOrder supplyOrder = supplyChallan.getSupplyOrder();
        if ( supplyOrder == null ) {
            return null;
        }
        Long id = supplyOrder.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyChallanSupplySalesRepresentativeId(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyChallan.getSupplySalesRepresentative();
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        Long id = supplySalesRepresentative.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyChallanSupplySalesRepresentativeName(SupplyChallan supplyChallan) {
        if ( supplyChallan == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyChallan.getSupplySalesRepresentative();
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
