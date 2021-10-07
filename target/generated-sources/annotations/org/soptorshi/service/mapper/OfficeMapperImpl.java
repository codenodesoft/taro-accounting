package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Office;
import org.soptorshi.service.dto.OfficeDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class OfficeMapperImpl implements OfficeMapper {

    @Override
    public Office toEntity(OfficeDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Office office = new Office();

        office.setId( dto.getId() );
        office.setName( dto.getName() );
        office.setDescription( dto.getDescription() );
        office.setLocation( dto.getLocation() );

        return office;
    }

    @Override
    public OfficeDTO toDto(Office entity) {
        if ( entity == null ) {
            return null;
        }

        OfficeDTO officeDTO = new OfficeDTO();

        officeDTO.setId( entity.getId() );
        officeDTO.setName( entity.getName() );
        officeDTO.setDescription( entity.getDescription() );
        officeDTO.setLocation( entity.getLocation() );

        return officeDTO;
    }

    @Override
    public List<Office> toEntity(List<OfficeDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Office> list = new ArrayList<Office>( dtoList.size() );
        for ( OfficeDTO officeDTO : dtoList ) {
            list.add( toEntity( officeDTO ) );
        }

        return list;
    }

    @Override
    public List<OfficeDTO> toDto(List<Office> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<OfficeDTO> list = new ArrayList<OfficeDTO>( entityList.size() );
        for ( Office office : entityList ) {
            list.add( toDto( office ) );
        }

        return list;
    }
}
