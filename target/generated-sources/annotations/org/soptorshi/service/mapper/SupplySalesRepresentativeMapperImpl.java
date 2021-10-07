package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyAreaManager;
import org.soptorshi.domain.SupplySalesRepresentative;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplySalesRepresentativeDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplySalesRepresentativeMapperImpl implements SupplySalesRepresentativeMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyAreaMapper supplyAreaMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;
    @Autowired
    private SupplyAreaManagerMapper supplyAreaManagerMapper;

    @Override
    public List<SupplySalesRepresentative> toEntity(List<SupplySalesRepresentativeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplySalesRepresentative> list = new ArrayList<SupplySalesRepresentative>( dtoList.size() );
        for ( SupplySalesRepresentativeDTO supplySalesRepresentativeDTO : dtoList ) {
            list.add( toEntity( supplySalesRepresentativeDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplySalesRepresentativeDTO> toDto(List<SupplySalesRepresentative> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplySalesRepresentativeDTO> list = new ArrayList<SupplySalesRepresentativeDTO>( entityList.size() );
        for ( SupplySalesRepresentative supplySalesRepresentative : entityList ) {
            list.add( toDto( supplySalesRepresentative ) );
        }

        return list;
    }

    @Override
    public SupplySalesRepresentativeDTO toDto(SupplySalesRepresentative supplySalesRepresentative) {
        if ( supplySalesRepresentative == null ) {
            return null;
        }

        SupplySalesRepresentativeDTO supplySalesRepresentativeDTO = new SupplySalesRepresentativeDTO();

        Long id = supplySalesRepresentativeSupplyAreaId( supplySalesRepresentative );
        if ( id != null ) {
            supplySalesRepresentativeDTO.setSupplyAreaId( id );
        }
        String name = supplySalesRepresentativeSupplyAreaName( supplySalesRepresentative );
        if ( name != null ) {
            supplySalesRepresentativeDTO.setSupplyAreaName( name );
        }
        String name1 = supplySalesRepresentativeSupplyZoneName( supplySalesRepresentative );
        if ( name1 != null ) {
            supplySalesRepresentativeDTO.setSupplyZoneName( name1 );
        }
        Long id1 = supplySalesRepresentativeSupplyZoneManagerId( supplySalesRepresentative );
        if ( id1 != null ) {
            supplySalesRepresentativeDTO.setSupplyZoneManagerId( id1 );
        }
        Long id2 = supplySalesRepresentativeSupplyAreaManagerId( supplySalesRepresentative );
        if ( id2 != null ) {
            supplySalesRepresentativeDTO.setSupplyAreaManagerId( id2 );
        }
        Long id3 = supplySalesRepresentativeSupplyZoneId( supplySalesRepresentative );
        if ( id3 != null ) {
            supplySalesRepresentativeDTO.setSupplyZoneId( id3 );
        }
        supplySalesRepresentativeDTO.setId( supplySalesRepresentative.getId() );
        supplySalesRepresentativeDTO.setName( supplySalesRepresentative.getName() );
        supplySalesRepresentativeDTO.setContact( supplySalesRepresentative.getContact() );
        supplySalesRepresentativeDTO.setEmail( supplySalesRepresentative.getEmail() );
        supplySalesRepresentativeDTO.setAdditionalInformation( supplySalesRepresentative.getAdditionalInformation() );
        supplySalesRepresentativeDTO.setCreatedBy( supplySalesRepresentative.getCreatedBy() );
        supplySalesRepresentativeDTO.setCreatedOn( supplySalesRepresentative.getCreatedOn() );
        supplySalesRepresentativeDTO.setUpdatedBy( supplySalesRepresentative.getUpdatedBy() );
        supplySalesRepresentativeDTO.setUpdatedOn( supplySalesRepresentative.getUpdatedOn() );
        supplySalesRepresentativeDTO.setStatus( supplySalesRepresentative.getStatus() );

        return supplySalesRepresentativeDTO;
    }

    @Override
    public SupplySalesRepresentative toEntity(SupplySalesRepresentativeDTO supplySalesRepresentativeDTO) {
        if ( supplySalesRepresentativeDTO == null ) {
            return null;
        }

        SupplySalesRepresentative supplySalesRepresentative = new SupplySalesRepresentative();

        supplySalesRepresentative.setSupplyArea( supplyAreaMapper.fromId( supplySalesRepresentativeDTO.getSupplyAreaId() ) );
        supplySalesRepresentative.setSupplyZone( supplyZoneMapper.fromId( supplySalesRepresentativeDTO.getSupplyZoneId() ) );
        supplySalesRepresentative.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplySalesRepresentativeDTO.getSupplyZoneManagerId() ) );
        supplySalesRepresentative.setSupplyAreaManager( supplyAreaManagerMapper.fromId( supplySalesRepresentativeDTO.getSupplyAreaManagerId() ) );
        supplySalesRepresentative.setId( supplySalesRepresentativeDTO.getId() );
        supplySalesRepresentative.setName( supplySalesRepresentativeDTO.getName() );
        supplySalesRepresentative.setContact( supplySalesRepresentativeDTO.getContact() );
        supplySalesRepresentative.setEmail( supplySalesRepresentativeDTO.getEmail() );
        supplySalesRepresentative.setAdditionalInformation( supplySalesRepresentativeDTO.getAdditionalInformation() );
        supplySalesRepresentative.setCreatedBy( supplySalesRepresentativeDTO.getCreatedBy() );
        supplySalesRepresentative.setCreatedOn( supplySalesRepresentativeDTO.getCreatedOn() );
        supplySalesRepresentative.setUpdatedBy( supplySalesRepresentativeDTO.getUpdatedBy() );
        supplySalesRepresentative.setUpdatedOn( supplySalesRepresentativeDTO.getUpdatedOn() );
        supplySalesRepresentative.setStatus( supplySalesRepresentativeDTO.getStatus() );

        return supplySalesRepresentative;
    }

    private Long supplySalesRepresentativeSupplyAreaId(SupplySalesRepresentative supplySalesRepresentative) {
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        SupplyArea supplyArea = supplySalesRepresentative.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        Long id = supplyArea.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String supplySalesRepresentativeSupplyAreaName(SupplySalesRepresentative supplySalesRepresentative) {
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        SupplyArea supplyArea = supplySalesRepresentative.getSupplyArea();
        if ( supplyArea == null ) {
            return null;
        }
        String name = supplyArea.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String supplySalesRepresentativeSupplyZoneName(SupplySalesRepresentative supplySalesRepresentative) {
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        SupplyZone supplyZone = supplySalesRepresentative.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplySalesRepresentativeSupplyZoneManagerId(SupplySalesRepresentative supplySalesRepresentative) {
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplySalesRepresentative.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplySalesRepresentativeSupplyAreaManagerId(SupplySalesRepresentative supplySalesRepresentative) {
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        SupplyAreaManager supplyAreaManager = supplySalesRepresentative.getSupplyAreaManager();
        if ( supplyAreaManager == null ) {
            return null;
        }
        Long id = supplyAreaManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplySalesRepresentativeSupplyZoneId(SupplySalesRepresentative supplySalesRepresentative) {
        if ( supplySalesRepresentative == null ) {
            return null;
        }
        SupplyZone supplyZone = supplySalesRepresentative.getSupplyZone();
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
