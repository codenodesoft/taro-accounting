package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.InventoryLocation;
import org.soptorshi.service.dto.InventoryLocationDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class InventoryLocationMapperImpl implements InventoryLocationMapper {

    @Override
    public InventoryLocation toEntity(InventoryLocationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        InventoryLocation inventoryLocation = new InventoryLocation();

        inventoryLocation.setId( dto.getId() );
        inventoryLocation.setName( dto.getName() );
        inventoryLocation.setShortName( dto.getShortName() );
        inventoryLocation.setDescription( dto.getDescription() );

        return inventoryLocation;
    }

    @Override
    public InventoryLocationDTO toDto(InventoryLocation entity) {
        if ( entity == null ) {
            return null;
        }

        InventoryLocationDTO inventoryLocationDTO = new InventoryLocationDTO();

        inventoryLocationDTO.setId( entity.getId() );
        inventoryLocationDTO.setName( entity.getName() );
        inventoryLocationDTO.setShortName( entity.getShortName() );
        inventoryLocationDTO.setDescription( entity.getDescription() );

        return inventoryLocationDTO;
    }

    @Override
    public List<InventoryLocation> toEntity(List<InventoryLocationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<InventoryLocation> list = new ArrayList<InventoryLocation>( dtoList.size() );
        for ( InventoryLocationDTO inventoryLocationDTO : dtoList ) {
            list.add( toEntity( inventoryLocationDTO ) );
        }

        return list;
    }

    @Override
    public List<InventoryLocationDTO> toDto(List<InventoryLocation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<InventoryLocationDTO> list = new ArrayList<InventoryLocationDTO>( entityList.size() );
        for ( InventoryLocation inventoryLocation : entityList ) {
            list.add( toDto( inventoryLocation ) );
        }

        return list;
    }
}
