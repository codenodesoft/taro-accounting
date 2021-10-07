package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SupplyArea;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.domain.SupplyZoneManager;
import org.soptorshi.service.dto.SupplyAreaDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyAreaMapperImpl implements SupplyAreaMapper {

    @Autowired
    private SupplyZoneMapper supplyZoneMapper;
    @Autowired
    private SupplyZoneManagerMapper supplyZoneManagerMapper;

    @Override
    public List<SupplyArea> toEntity(List<SupplyAreaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyArea> list = new ArrayList<SupplyArea>( dtoList.size() );
        for ( SupplyAreaDTO supplyAreaDTO : dtoList ) {
            list.add( toEntity( supplyAreaDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyAreaDTO> toDto(List<SupplyArea> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyAreaDTO> list = new ArrayList<SupplyAreaDTO>( entityList.size() );
        for ( SupplyArea supplyArea : entityList ) {
            list.add( toDto( supplyArea ) );
        }

        return list;
    }

    @Override
    public SupplyAreaDTO toDto(SupplyArea supplyArea) {
        if ( supplyArea == null ) {
            return null;
        }

        SupplyAreaDTO supplyAreaDTO = new SupplyAreaDTO();

        String name = supplyAreaSupplyZoneName( supplyArea );
        if ( name != null ) {
            supplyAreaDTO.setSupplyZoneName( name );
        }
        Long id = supplyAreaSupplyZoneManagerId( supplyArea );
        if ( id != null ) {
            supplyAreaDTO.setSupplyZoneManagerId( id );
        }
        Long id1 = supplyAreaSupplyZoneId( supplyArea );
        if ( id1 != null ) {
            supplyAreaDTO.setSupplyZoneId( id1 );
        }
        supplyAreaDTO.setId( supplyArea.getId() );
        supplyAreaDTO.setName( supplyArea.getName() );
        supplyAreaDTO.setCode( supplyArea.getCode() );
        supplyAreaDTO.setCreatedBy( supplyArea.getCreatedBy() );
        supplyAreaDTO.setCreatedOn( supplyArea.getCreatedOn() );
        supplyAreaDTO.setUpdatedBy( supplyArea.getUpdatedBy() );
        supplyAreaDTO.setUpdatedOn( supplyArea.getUpdatedOn() );

        return supplyAreaDTO;
    }

    @Override
    public SupplyArea toEntity(SupplyAreaDTO supplyAreaDTO) {
        if ( supplyAreaDTO == null ) {
            return null;
        }

        SupplyArea supplyArea = new SupplyArea();

        supplyArea.setSupplyZone( supplyZoneMapper.fromId( supplyAreaDTO.getSupplyZoneId() ) );
        supplyArea.setSupplyZoneManager( supplyZoneManagerMapper.fromId( supplyAreaDTO.getSupplyZoneManagerId() ) );
        supplyArea.setId( supplyAreaDTO.getId() );
        supplyArea.setName( supplyAreaDTO.getName() );
        supplyArea.setCode( supplyAreaDTO.getCode() );
        supplyArea.setCreatedBy( supplyAreaDTO.getCreatedBy() );
        supplyArea.setCreatedOn( supplyAreaDTO.getCreatedOn() );
        supplyArea.setUpdatedBy( supplyAreaDTO.getUpdatedBy() );
        supplyArea.setUpdatedOn( supplyAreaDTO.getUpdatedOn() );

        return supplyArea;
    }

    private String supplyAreaSupplyZoneName(SupplyArea supplyArea) {
        if ( supplyArea == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyArea.getSupplyZone();
        if ( supplyZone == null ) {
            return null;
        }
        String name = supplyZone.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long supplyAreaSupplyZoneManagerId(SupplyArea supplyArea) {
        if ( supplyArea == null ) {
            return null;
        }
        SupplyZoneManager supplyZoneManager = supplyArea.getSupplyZoneManager();
        if ( supplyZoneManager == null ) {
            return null;
        }
        Long id = supplyZoneManager.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long supplyAreaSupplyZoneId(SupplyArea supplyArea) {
        if ( supplyArea == null ) {
            return null;
        }
        SupplyZone supplyZone = supplyArea.getSupplyZone();
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
