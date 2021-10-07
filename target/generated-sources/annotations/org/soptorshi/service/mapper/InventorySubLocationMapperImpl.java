package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.InventoryLocation;
import org.soptorshi.domain.InventorySubLocation;
import org.soptorshi.service.dto.InventorySubLocationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class InventorySubLocationMapperImpl implements InventorySubLocationMapper {

    @Autowired
    private InventoryLocationMapper inventoryLocationMapper;

    @Override
    public List<InventorySubLocation> toEntity(List<InventorySubLocationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<InventorySubLocation> list = new ArrayList<InventorySubLocation>( dtoList.size() );
        for ( InventorySubLocationDTO inventorySubLocationDTO : dtoList ) {
            list.add( toEntity( inventorySubLocationDTO ) );
        }

        return list;
    }

    @Override
    public List<InventorySubLocationDTO> toDto(List<InventorySubLocation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<InventorySubLocationDTO> list = new ArrayList<InventorySubLocationDTO>( entityList.size() );
        for ( InventorySubLocation inventorySubLocation : entityList ) {
            list.add( toDto( inventorySubLocation ) );
        }

        return list;
    }

    @Override
    public InventorySubLocationDTO toDto(InventorySubLocation inventorySubLocation) {
        if ( inventorySubLocation == null ) {
            return null;
        }

        InventorySubLocationDTO inventorySubLocationDTO = new InventorySubLocationDTO();

        Long id = inventorySubLocationInventoryLocationsId( inventorySubLocation );
        if ( id != null ) {
            inventorySubLocationDTO.setInventoryLocationsId( id );
        }
        String name = inventorySubLocationInventoryLocationsName( inventorySubLocation );
        if ( name != null ) {
            inventorySubLocationDTO.setInventoryLocationsName( name );
        }
        inventorySubLocationDTO.setId( inventorySubLocation.getId() );
        inventorySubLocationDTO.setCategory( inventorySubLocation.getCategory() );
        inventorySubLocationDTO.setName( inventorySubLocation.getName() );
        inventorySubLocationDTO.setShortName( inventorySubLocation.getShortName() );
        inventorySubLocationDTO.setDescription( inventorySubLocation.getDescription() );

        return inventorySubLocationDTO;
    }

    @Override
    public InventorySubLocation toEntity(InventorySubLocationDTO inventorySubLocationDTO) {
        if ( inventorySubLocationDTO == null ) {
            return null;
        }

        InventorySubLocation inventorySubLocation = new InventorySubLocation();

        inventorySubLocation.setInventoryLocations( inventoryLocationMapper.fromId( inventorySubLocationDTO.getInventoryLocationsId() ) );
        inventorySubLocation.setId( inventorySubLocationDTO.getId() );
        inventorySubLocation.setCategory( inventorySubLocationDTO.getCategory() );
        inventorySubLocation.setName( inventorySubLocationDTO.getName() );
        inventorySubLocation.setShortName( inventorySubLocationDTO.getShortName() );
        inventorySubLocation.setDescription( inventorySubLocationDTO.getDescription() );

        return inventorySubLocation;
    }

    private Long inventorySubLocationInventoryLocationsId(InventorySubLocation inventorySubLocation) {
        if ( inventorySubLocation == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = inventorySubLocation.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        Long id = inventoryLocations.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String inventorySubLocationInventoryLocationsName(InventorySubLocation inventorySubLocation) {
        if ( inventorySubLocation == null ) {
            return null;
        }
        InventoryLocation inventoryLocations = inventorySubLocation.getInventoryLocations();
        if ( inventoryLocations == null ) {
            return null;
        }
        String name = inventoryLocations.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }
}
