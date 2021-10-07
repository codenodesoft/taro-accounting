package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SupplyZone;
import org.soptorshi.service.dto.SupplyZoneDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SupplyZoneMapperImpl implements SupplyZoneMapper {

    @Override
    public SupplyZone toEntity(SupplyZoneDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SupplyZone supplyZone = new SupplyZone();

        supplyZone.setId( dto.getId() );
        supplyZone.setName( dto.getName() );
        supplyZone.setCode( dto.getCode() );
        supplyZone.setCreatedBy( dto.getCreatedBy() );
        supplyZone.setCreatedOn( dto.getCreatedOn() );
        supplyZone.setUpdatedBy( dto.getUpdatedBy() );
        supplyZone.setUpdatedOn( dto.getUpdatedOn() );

        return supplyZone;
    }

    @Override
    public SupplyZoneDTO toDto(SupplyZone entity) {
        if ( entity == null ) {
            return null;
        }

        SupplyZoneDTO supplyZoneDTO = new SupplyZoneDTO();

        supplyZoneDTO.setId( entity.getId() );
        supplyZoneDTO.setName( entity.getName() );
        supplyZoneDTO.setCode( entity.getCode() );
        supplyZoneDTO.setCreatedBy( entity.getCreatedBy() );
        supplyZoneDTO.setCreatedOn( entity.getCreatedOn() );
        supplyZoneDTO.setUpdatedBy( entity.getUpdatedBy() );
        supplyZoneDTO.setUpdatedOn( entity.getUpdatedOn() );

        return supplyZoneDTO;
    }

    @Override
    public List<SupplyZone> toEntity(List<SupplyZoneDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SupplyZone> list = new ArrayList<SupplyZone>( dtoList.size() );
        for ( SupplyZoneDTO supplyZoneDTO : dtoList ) {
            list.add( toEntity( supplyZoneDTO ) );
        }

        return list;
    }

    @Override
    public List<SupplyZoneDTO> toDto(List<SupplyZone> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SupplyZoneDTO> list = new ArrayList<SupplyZoneDTO>( entityList.size() );
        for ( SupplyZone supplyZone : entityList ) {
            list.add( toDto( supplyZone ) );
        }

        return list;
    }
}
