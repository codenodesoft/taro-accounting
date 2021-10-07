package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyAreaManager;
import org.soptorshi.domain.SupplySalesRepresentative;
import org.soptorshi.domain.SupplyShop;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyShopDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyShopMapperImpl implements SupplyShopMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyAreaMapper supplyAreaMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;
    @Autowired
    private SupplyAreaManagerMapper supplyAreaManagerMapper;
    @Autowired
    private SupplySalesRepresentativeMapper supplySalesRepresentativeMapper;

    @Override
    public List<SupplyShop> toEntity(List<SupplyShopDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyShop> list = new ArrayList<SupplyShop>( dtoList.size() );
        for ( SupplyShopDTO supplyShopDTO : dtoList ) {
            list.add( toEntity( supplyShopDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyShopDTO> toDto(List<SupplyShop> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyShopDTO> list = new ArrayList<SupplyShopDTO>( entityList.size() );
        for ( SupplyShop supplyShop : entityList ) {
            list.add( toDto( supplyShop ) );
        }

        return list;
    }

    @Override
    public SupplyShopDTO toDto(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }

        SupplyShopDTO supplyShopDTO = new SupplyShopDTO();

        Long id = supplyShopSupplyAreaId( supplyShop );
        if ( id != null ) {
            supplyShopDTO.setSupplyAreaId( id );
        }
        String name = supplyShopSupplyAreaName( supplyShop );
        if ( name != null ) {
            supplyShopDTO.setSupplyAreaName( name );
        }
        String name1 = supplyShopSupplyZoneName( supplyShop );
        if ( name1 != null ) {
            supplyShopDTO.setSupplyZoneName( name1 );
        }
        Long id1 = supplyShopSupplyZoneManagerId( supplyShop );
        if ( id1 != null ) {
            supplyShopDTO.setSupplyZoneManagerId( id1 );
        }
        Long id2 = supplyShopSupplySalesRepresentativeId( supplyShop );
        if ( id2 != null ) {
            supplyShopDTO.setSupplySalesRepresentativeId( id2 );
        }
        String name2 = supplyShopSupplySalesRepresentativeName( supplyShop );
        if ( name2 != null ) {
            supplyShopDTO.setSupplySalesRepresentativeName( name2 );
        }
        Long id3 = supplyShopSupplyAreaManagerId( supplyShop );
        if ( id3 != null ) {
            supplyShopDTO.setSupplyAreaManagerId( id3 );
        }
        Long id4 = supplyShopSupplyZoneId( supplyShop );
        if ( id4 != null ) {
            supplyShopDTO.setSupplyZoneId( id4 );
        }
        supplyShopDTO.setId( supplyShop.getId() );
        supplyShopDTO.setName( supplyShop.getName() );
        supplyShopDTO.setContact( supplyShop.getContact() );
        supplyShopDTO.setEmail( supplyShop.getEmail() );
        supplyShopDTO.setAddress( supplyShop.getAddress() );
        supplyShopDTO.setAdditionalInformation( supplyShop.getAdditionalInformation() );
        supplyShopDTO.setCreatedBy( supplyShop.getCreatedBy() );
        supplyShopDTO.setCreatedOn( supplyShop.getCreatedOn() );
        supplyShopDTO.setUpdatedBy( supplyShop.getUpdatedBy() );
        supplyShopDTO.setUpdatedOn( supplyShop.getUpdatedOn() );

        return supplyShopDTO;
    }

    @Override
    public SupplyShop toEntity(SupplyShopDTO supplyShopDTO) {
        if ( supplyShopDTO == null ) {
            return null;
        }

        SupplyShop supplyShop = new SupplyShop();

        supplyShop.setSupplyArea( supplyAreaMapper.fromId( supplyShopDTO.getSupplyAreaId() ) );
        supplyShop.setSupplyZone( supplyZoneMapper.fromId( supplyShopDTO.getSupplyZoneId() ) );
        supplyShop.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyShopDTO.getSupplyZoneManagerId() ) );
        supplyShop.setSupplyAreaManager( supplyAreaManagerMapper.fromId( supplyShopDTO.getSupplyAreaManagerId() ) );
        supplyShop.setSupplySalesRepresentative( supplySalesRepresentativeMapper.fromId( supplyShopDTO.getSupplySalesRepresentativeId() ) );
        supplyShop.setId( supplyShopDTO.getId() );
        supplyShop.setName( supplyShopDTO.getName() );
        supplyShop.setContact( supplyShopDTO.getContact() );
        supplyShop.setEmail( supplyShopDTO.getEmail() );
        supplyShop.setAddress( supplyShopDTO.getAddress() );
        supplyShop.setAdditionalInformation( supplyShopDTO.getAdditionalInformation() );
        supplyShop.setCreatedBy( supplyShopDTO.getCreatedBy() );
        supplyShop.setCreatedOn( supplyShopDTO.getCreatedOn() );
        supplyShop.setUpdatedBy( supplyShopDTO.getUpdatedBy() );
        supplyShop.setUpdatedOn( supplyShopDTO.getUpdatedOn() );

        return supplyShop;
    }

    private Long supplyShopSupplyAreaId(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyShop.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        Long id = supplyArea.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyShopSupplyAreaName(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplyArea supplyArea = supplyShop.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        String name = supplyArea.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplyShopSupplyZoneName(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyShop.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyShopSupplyZoneManagerId(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyShop.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyShopSupplySalesRepresentativeId(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyShop.getSupplySalesRepresentative();
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        Long id = supplySalesRepresentative.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplyShopSupplySalesRepresentativeName(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplySalesRepresentative supplySalesRepresentative = supplyShop.getSupplySalesRepresentative();
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        String name = supplySalesRepresentative.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyShopSupplyAreaManagerId(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplyAreaManager supplyAreaManager = supplyShop.getSupplyAreaManager();
        if ( supplyAreaManager == null ) {
            return null;
        }
        Long id = supplyAreaManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyShopSupplyZoneId(SupplyShop supplyShop) {
        if ( supplyShop == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyShop.getSupplyZone();
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
