package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.SpecialAllowanceTimeLine;
import org.soptorshi.service.dto.SpecialAllowanceTimeLineDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class SpecialAllowanceTimeLineMapperImpl implements SpecialAllowanceTimeLineMapper {

    @Override
    public SpecialAllowanceTimeLine toEntity(SpecialAllowanceTimeLineDTO dto) {
        if ( dto == null ) {
            return null;
        }

        SpecialAllowanceTimeLine specialAllowanceTimeLine = new SpecialAllowanceTimeLine();

        specialAllowanceTimeLine.setId( dto.getId() );
        specialAllowanceTimeLine.setAllowanceType( dto.getAllowanceType() );
        specialAllowanceTimeLine.setReligion( dto.getReligion() );
        specialAllowanceTimeLine.setYear( dto.getYear() );
        specialAllowanceTimeLine.setMonth( dto.getMonth() );
        specialAllowanceTimeLine.setModifiedBy( dto.getModifiedBy() );
        specialAllowanceTimeLine.setModifiedOn( dto.getModifiedOn() );

        return specialAllowanceTimeLine;
    }

    @Override
    public SpecialAllowanceTimeLineDTO toDto(SpecialAllowanceTimeLine entity) {
        if ( entity == null ) {
            return null;
        }

        SpecialAllowanceTimeLineDTO specialAllowanceTimeLineDTO = new SpecialAllowanceTimeLineDTO();

        specialAllowanceTimeLineDTO.setId( entity.getId() );
        specialAllowanceTimeLineDTO.setAllowanceType( entity.getAllowanceType() );
        specialAllowanceTimeLineDTO.setReligion( entity.getReligion() );
        specialAllowanceTimeLineDTO.setYear( entity.getYear() );
        specialAllowanceTimeLineDTO.setMonth( entity.getMonth() );
        specialAllowanceTimeLineDTO.setModifiedBy( entity.getModifiedBy() );
        specialAllowanceTimeLineDTO.setModifiedOn( entity.getModifiedOn() );

        return specialAllowanceTimeLineDTO;
    }

    @Override
    public List<SpecialAllowanceTimeLine> toEntity(List<SpecialAllowanceTimeLineDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SpecialAllowanceTimeLine> list = new ArrayList<SpecialAllowanceTimeLine>( dtoList.size() );
        for ( SpecialAllowanceTimeLineDTO specialAllowanceTimeLineDTO : dtoList ) {
            list.add( toEntity( specialAllowanceTimeLineDTO ) );
        }

        return list;
    }

    @Override
    public List<SpecialAllowanceTimeLineDTO> toDto(List<SpecialAllowanceTimeLine> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SpecialAllowanceTimeLineDTO> list = new ArrayList<SpecialAllowanceTimeLineDTO>( entityList.size() );
        for ( SpecialAllowanceTimeLine specialAllowanceTimeLine : entityList ) {
            list.add( toDto( specialAllowanceTimeLine ) );
        }

        return list;
    }
}
