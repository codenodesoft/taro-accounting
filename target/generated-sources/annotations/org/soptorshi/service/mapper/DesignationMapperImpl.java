package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Designation;
import org.soptorshi.service.dto.DesignationDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class DesignationMapperImpl implements DesignationMapper {

    @Override
    public Designation toEntity(DesignationDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Designation designation = new Designation();

        designation.setId( dto.getId() );
        designation.setName( dto.getName() );
        designation.setShortName( dto.getShortName() );
        designation.setDescription( dto.getDescription() );

        return designation;
    }

    @Override
    public DesignationDTO toDto(Designation entity) {
        if ( entity == null ) {
            return null;
        }

        DesignationDTO designationDTO = new DesignationDTO();

        designationDTO.setId( entity.getId() );
        designationDTO.setName( entity.getName() );
        designationDTO.setShortName( entity.getShortName() );
        designationDTO.setDescription( entity.getDescription() );

        return designationDTO;
    }

    @Override
    public List<Designation> toEntity(List<DesignationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Designation> list = new ArrayList<Designation>( dtoList.size() );
        for ( DesignationDTO designationDTO : dtoList ) {
            list.add( toEntity( designationDTO ) );
        }

        return list;
    }

    @Override
    public List<DesignationDTO> toDto(List<Designation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<DesignationDTO> list = new ArrayList<DesignationDTO>( entityList.size() );
        for ( Designation designation : entityList ) {
            list.add( toDto( designation ) );
        }

        return list;
    }
}
